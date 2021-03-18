package LoginC

class LogRegController {
    def credService

    def index() {
        render(view: "login")
    }

    def varif() {

        if (request.method == 'POST') {
            def res = credService.getUserInformation(params)
            if (res) {
                def nickname = params.username.split('@')
                session["user"] = nickname[0]
                redirect(controller: 'department', action: 'showDepartments')
            } else {
                flash.message = "Ελέγξτε τα στοιχεία που εισάγατε"
                redirect(controller: 'logReg')
            }
        }
    }

    def logout() {
        session.invalidate()
        redirect(controller: 'logReg')
    }

}
