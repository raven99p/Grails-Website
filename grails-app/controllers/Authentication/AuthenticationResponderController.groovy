package Authentication

class AuthenticationResponderController {
    def authService

    def verify() {
        //respond responseMessage: request.getJSON()
        def userFound = authService.getUserInformation(request.getJSON())
        if (userFound) {
            def nickname = request.getJSON().username.split('@')
            session["user"] = nickname[0]
            respond (status: 200, sessionVarible: session["user"] )
        } else {
            flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
            respond status: 400
        }

    }
    def logout() {
        session.invalidate()
        respond (status: 200, sessionVarible: null)
    }
}
