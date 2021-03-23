package helloworld

import Departments.DepartmentResponderController
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DepartmentResponderControllerSpec extends Specification implements ControllerUnitTest<DepartmentResponderController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
