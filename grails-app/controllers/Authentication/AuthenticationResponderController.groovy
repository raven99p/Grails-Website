package Authentication

class AuthenticationResponderController {
    def authService

    def varify() {
        if (request.method == 'POST') {
            def userFound = authService.getUserInformation(params)

            if (userFound) {
                def nickname = params.username.split('@')
                session["user"] = nickname[0]
                respond true
            } else {
                flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
                respond false
            }
        }
    }

    def logout() {
        session.invalidate()
    }
}
