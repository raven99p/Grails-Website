package helloworld

import Employee.EmployeeResponderService
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class EmployeeResponderServiceSpec extends Specification implements ServiceUnitTest<EmployeeResponderService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
