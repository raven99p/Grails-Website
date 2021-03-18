class AuthInterceptor {

    AuthInterceptor() {
        matchAll().excludes(controllerClass:'logReg')
    }

    boolean before() {
        if (session["user"]) {
            return true
        }
        redirect(controller: "logReg")
        return false
    }
}
