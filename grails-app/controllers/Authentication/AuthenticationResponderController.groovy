package Authentication

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.SignatureGenerationException;
import com.auth0.jwt.impl.ClaimsHolder;
import com.auth0.jwt.impl.PayloadSerializer;
import com.auth0.jwt.impl.PublicClaims;

class AuthenticationResponderController {
    def authService

    def verify() {
        def userFound = authService.getUserInformation(request.getJSON())
        if (userFound) {
            def nickname = request.getJSON().username.split('@')


            response.setCookie('authentication', nickname[0])
            respond (status: 200, cookie: request.getCookie('authentication') )
            return true
        } else {
            flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
            respond status: 400
            return false
        }

    }
    def logout() {
        response.deleteCookie('authentication')
        respond (status: 200, cookie: request.getCookie('authentication'))
    }


}
