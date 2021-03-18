package LoginC

class LogRegController {
    def credService

    def login() {
    }

    def varif() {
        if (request.method == 'POST') {
            def res = credService.getUserInformation(params)
            if (res) {
                def nickname = params.username.split('@')
                session["user"] = nickname[0]
                redirect(controller: 'department', action: 'showDepartments')
            } else {
                flash.message = "Τα στοιχεία που εισάγατε είναι λάθος"
                redirect(controller: 'logReg', action: 'login')
            }
        }
    }

    def logout() {
        session.invalidate()
        redirect(controller: 'logReg', action: 'login')
    }

}
