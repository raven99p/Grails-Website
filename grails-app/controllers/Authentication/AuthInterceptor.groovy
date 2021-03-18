package Authentication

class AuthInterceptor {

    AuthInterceptor() {
        matchAll().excludes(controllerClass:'authentication')
    }

    boolean before() {
        if (session["user"]) {
            return true
        }
        redirect(controller: "authentication")
        return false
    }
}
