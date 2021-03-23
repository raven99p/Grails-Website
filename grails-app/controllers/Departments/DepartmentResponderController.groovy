package Departments

import grails.converters.JSON
import groovy.json.JsonSlurper

class DepartmentResponderController {

    def deptService
    def empService

    def getDepartments() { //http://localhost:8080/departmentResponder/getDepartments.json
        respond deptService.getAllDepartments()
    }

    def postDepartment() { //http://localhost:8080/departmentResponder/postDepartment.json
        def requestBodyDepartmentName = request.getJSON()
        respond responseMessage: deptService.createDept(requestBodyDepartmentName)
    }

    def updateDepartment() { //http://localhost:8080/departmentResponder/updateDepartment.json
        def requestBodyDepartmentInformation = request.getJSON()
        respond responseMessage: deptService.updateDept(requestBodyDepartmentInformation)
    }

    def deleteDepartment() { //http://localhost:8080/departmentResponder/deleteDepartment.json
        def requestBodyDepartmentId = request.getJSON()
        respond responseMessage: deptService.deleteDept(requestBodyDepartmentId)
    }
}
