package helloworld

import Authentication.AuthenticationResponderInterceptor
import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class AuthenticationResponderInterceptorSpec extends Specification implements InterceptorUnitTest<AuthenticationResponderInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test authenticationResponder interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"authenticationResponder")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
