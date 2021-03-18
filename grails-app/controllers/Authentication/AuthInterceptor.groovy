package Authentication

class AuthInterceptor {
    AuthInterceptor() {
        matchAll().excludes(controller: 'authentication')
    }

    boolean before() {
        if (session.user) {
            return true
        }
        redirect(controller: "authentication", action: 'login')
        return false
    }
}