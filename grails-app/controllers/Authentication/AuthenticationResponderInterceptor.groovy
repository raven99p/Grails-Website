package Authentication


class AuthenticationResponderInterceptor {
    AuthenticationResponderInterceptor(){
        matchAll().excludes(controller: 'authenticationResponder')
                .excludes(controller: 'authentication')
                .excludes(controller: 'employee')
                .excludes(controller: 'department')
    }

    boolean before() {

        true
    }


}
