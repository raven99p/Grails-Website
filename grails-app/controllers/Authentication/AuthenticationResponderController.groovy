package Authentication

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.SignatureGenerationException;
import com.auth0.jwt.impl.ClaimsHolder;
import com.auth0.jwt.impl.PayloadSerializer;
import com.auth0.jwt.impl.PublicClaims

import javax.servlet.http.Cookie;

class AuthenticationResponderController {
    def authService
    static responseFormats = ['json']
    def verify() {
        def userFound = authService.getUserInformation(request.getJSON())
        if (userFound) {
            def nickname = request.getJSON().username.split('@')
            try {
                Algorithm algorithm = Algorithm.HMAC256('F90C6860-70C1-4B33-BE08-30E160B54CB6');
                String token = JWT.create()
                        .withIssuer("auth0")
                        .sign(algorithm);
                Cookie cookie = new Cookie("authentication", token)
                cookie.maxAge = 3600
                cookie.httpOnly = true
                cookie.setPath("/")
                response.addCookie(cookie)

                respond(status: 200, formats: responseFormats)
            } catch (JWTCreationException exception) {
            }

            return true
        } else {
            flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
            respond status: 400
            return false
        }

    }

    def logout() {
        Cookie cookie = new Cookie("authentication", null); // Not necessary, but saves bandwidth.
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(0); // Don't set to -1 or it will become a session cookie!
        response.addCookie(cookie);
        respond(status: 200)
    }


}
