package helloworld

class LogRegController {
    def CredService
    def index() {
        render(view:"login")
    }

    def varif() {

        //render (params)
        def res = CredService.getPwdByUser(params)
        if(res) {
            redirect(controller: 'employee', action:'index')
        }
        //render(view: "varif", model: [params:params])
    }
    def logout() {
        CredService.logout()
        redirect(controller: 'logReg', action:'index')
    }

}
