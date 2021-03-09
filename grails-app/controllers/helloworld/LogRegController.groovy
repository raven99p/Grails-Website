package helloworld

class LogRegController {
    def CredService
    def index() {
        def res = CredService.getPwdByUser()
        render(view: "login", model: [res:res])
    }
}
