package Authentication

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT
import com.auth0.jwt.interfaces.JWTVerifier

import javax.servlet.http.Cookie;

class AuthenticationResponderController {
    def authService
    static responseFormats = ['json']

    def verify() {
        def userFound = authService.getUserInformation(request.getJSON())
        if (userFound) {
            def nickname = request.getJSON().username.split('@')
            try {
                Algorithm algorithm = Algorithm.HMAC256('b6a36302-f106-43e8-8c32-3b4f433d837bccd524f2-baae-45d7-b0e1-d6294dc460da');
                String token = JWT.create()
                        .withIssuer("auth0")
                        .withClaim("username", nickname[0])
                        .sign(algorithm);
                Cookie cookie = new Cookie("authentication", token)
                cookie.maxAge = 100000000
                cookie.httpOnly = true
                cookie.setPath("/")
                /*

                */
                session["user"] = nickname[0];
                response.addCookie(cookie)
                respond(status: 200, formats: responseFormats)
            } catch (JWTCreationException exception) {
            }


            return true
        } else {
            flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
            respond(status: 400)
            return false
        }

    }

    def logout() {
        session.invalidate()
        Cookie cookie = new Cookie("authentication", null); // Not necessary, but saves bandwidth.
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(0); // Don't set to -1 or it will become a session cookie!
        response.addCookie(cookie);
        respond(status: 200)
    }

    def getSessionVariable() {

        Algorithm algorithm = Algorithm.HMAC256('b6a36302-f106-43e8-8c32-3b4f433d837bccd524f2-baae-45d7-b0e1-d6294dc460da');
        def token = request.cookies.find { it.name == 'authentication' }
        try {
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build();
            DecodedJWT jwt = verifier.verify(token.value);
            respond(status: 200, sessionVariable: jwt.claims.username.toString())
        } catch (JWTVerificationException exception) {
            respond(status: 401, sessionVariable: 'Not found')
        }
    }
}
