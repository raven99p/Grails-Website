package helloworld

import Employees.EmployeeResponderController
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class EmployeeResponderControllerSpec extends Specification implements ControllerUnitTest<EmployeeResponderController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
