package helloworld

class LogRegController {
    def CredService

    def index() {
        render(view: "login")
    }

    def varif() {

        if (request.method == 'POST') {
            def res = CredService.getPwdByUser(params)
            if (res) {
                def nickname = params.username.split('@')
                session["user"] = [nickname[0]]
                redirect(controller: 'employee', action: 'index')
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
