package helloworld


class AuthInterceptor {

    CredService credService
    AuthInterceptor() {
        match controller: 'employee'
    }


    boolean before() {
        if (credService.isAuth()){
            return true
        }
        redirect(controller: "logReg", action: "index")
        return false
    }
}
