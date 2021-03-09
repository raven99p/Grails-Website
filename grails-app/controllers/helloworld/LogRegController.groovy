package helloworld

class LogRegController {
    def CredService
    def index() {
        render(view:"login")
    }

    def varif() {
        render (params)
        //def res = CredService.getPwdByUser(username)
        //render(view: "varif", model: [params:params])
    }
}
