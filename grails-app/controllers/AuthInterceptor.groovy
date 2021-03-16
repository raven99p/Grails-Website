class AuthInterceptor {

    AuthInterceptor() {
        matchAll().excludes(controllerClass:'LogReg')
    }

    boolean before() {
        if (session) {
            return true
        }
        redirect(controller: "logReg")
        return false
    }
}
