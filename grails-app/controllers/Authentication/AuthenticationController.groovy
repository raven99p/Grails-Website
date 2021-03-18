package Authentication

class AuthenticationController {

    def authService

    def login() {
    }

    def varify() {
        if (request.method == 'POST') {
            def res = authService.getUserInformation(params)

            if (res) {
                def nickname = params.username.split('@')
                session["user"] = nickname[0]
                redirect(controller: 'department', action: 'showDepartments')
                return true
            } else {
                flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
                redirect(action: 'login')
                return false
            }
        }
    }

    def logout() {
        session.invalidate()
        redirect(action: 'login')
    }
}
