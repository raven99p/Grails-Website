package Authentication

class AuthInterceptor {
    AuthInterceptor() {
        matchAll().excludes(controller: 'authentication')
                .excludes(controller: 'authenticationResponder')
                .excludes(controller: 'employeeResponder')
                .excludes(controller: 'departmentResponder')

    }

    boolean before() {
        if (session.user) {
            return true
        }
        redirect(controller: "authentication", action: 'login')
        return false
    }
}

