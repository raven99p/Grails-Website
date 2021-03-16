class AuthInterceptor {

    AuthInterceptor() {
        matchAll().excludes(controllerClass:'LogReg')
    }

    boolean before() {
        if (session.getAttribute("user") != null) {
            return true
        }
        redirect(controller: "logReg")
        return false
    }
}
