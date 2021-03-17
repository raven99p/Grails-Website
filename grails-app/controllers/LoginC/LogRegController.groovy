package LoginC

class LogRegController {
    def credService

    def index() {
        render(view: "login")
    }

    def varif() {

        if (request.method == 'POST') {
            def res = credService.getPwdByUser(params)
            if (res) {
                def nickname = params.username.split('@')
                session["user"] = nickname[0]
                redirect(controller: 'general', action: 'showDepartments')
            } else {
                flash.message = "User not found"
                redirect(controller: 'logReg')
            }
        }
    }

    def logout() {
        session.invalidate()
        redirect(controller: 'logReg')
    }

}
