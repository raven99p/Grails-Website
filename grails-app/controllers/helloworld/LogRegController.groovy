package helloworld

class LogRegController {
    def CredService
    def index() {
        render(view:"login")
    }

    def varif() {

        //render (params.username)
        def res = CredService.getPwdByUser(params.username)
        render res
        if(res==res) {
            redirect(controller: 'employee', action:'index')
        }
        //render(view: "varif", model: [params:params])
    }
}
