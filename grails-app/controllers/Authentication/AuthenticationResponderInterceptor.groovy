package Authentication

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.auth0.jwt.exceptions.JWTVerificationException
import com.auth0.jwt.interfaces.DecodedJWT
import com.auth0.jwt.interfaces.JWTVerifier


class AuthenticationResponderInterceptor {
    AuthenticationResponderInterceptor() {
        matchAll().excludes(controller: 'authenticationResponder')
                .excludes(controller: 'authentication')
                .excludes(controller: 'employee')
                .excludes(controller: 'department')
    }

    boolean before() {
        Algorithm algorithm = Algorithm.HMAC256('b6a36302-f106-43e8-8c32-3b4f433d837bccd524f2-baae-45d7-b0e1-d6294dc460da');

        try {
            def token = request.cookies.find { it.name == 'authentication' }
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build();
            DecodedJWT jwt = verifier.verify(token.value);
            return true
        } catch (JWTVerificationException exception) {
            response.status= 401
            return false
        } catch (e) {
            response.status= 401
            return false
        }

    }
}
