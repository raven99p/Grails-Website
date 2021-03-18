package Authentication

class AuthenticationController {

    def authService

    def login() {
    }

    def varify() {
        if (request.method == 'POST') {
            def res = credService.getUserInformation(params)
            if (res) {
                def nickname = params.username.split('@')
                session["user"] = nickname[0]
                redirect(controller: 'department', action: 'showDepartments')
            } else {
                flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
                redirect(controller: 'authentication', action: 'login')
            }
        }
    }

    def logout() {
        session.invalidate()
        redirect(controller: 'logReg', action: 'login')
    }
}
