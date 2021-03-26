package Departments


class DepartmentResponderController {

    def deptService


    def getDepartments() { //http://localhost:8080/departmentResponder/getDepartments.json
        respond(status: 200, responseMessage: deptService.getAllDepartments())
    }

    def postDepartment() { //http://localhost:8080/departmentResponder/postDepartment.json
        def requestBodyDepartmentName = request.getJSON()
        respond(status: 200, responseMessage: deptService.createDept(requestBodyDepartmentName))
    }

    def updateDepartmentForm() {
        def requestBodyDepartmentId = params["id"].toInteger()
        respond(status: 200, responseMessage: deptService.getDeptById(requestBodyDepartmentId))
    }

    def updateDepartment() { //http://localhost:8080/departmentResponder/updateDepartment.json
        def requestBodyDepartmentInformation = request.getJSON()
        respond(status: 200, responseMessage: deptService.updateDept(requestBodyDepartmentInformation))
    }

    def deleteDepartment() { //http://localhost:8080/departmentResponder/deleteDepartment.json
        def requestBodyDepartmentId = request.getJSON()
        respond(status: 200, responseMessage: deptService.deleteDept(requestBodyDepartmentId))
    }
}
