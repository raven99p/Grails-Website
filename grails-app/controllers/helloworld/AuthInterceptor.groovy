package helloworld


class AuthInterceptor {

    CredService credService

    AuthInterceptor() {
        match controller: 'employee'
    }


    boolean before() {
        if (session.getAttribute("user") != null) {
            return true
        }
        redirect(controller: "logReg")
        return false
    }
}
