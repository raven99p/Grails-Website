package Departments


class DepartmentResponderController {

    def deptService


    def getDepartments() { //http://localhost:8080/departmentResponder/getDepartments.json
        try {
            respond(status: 200, responseMessage: deptService.getAllDepartments())
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }

    def postDepartment() { //http://localhost:8080/departmentResponder/postDepartment.json
        def requestBodyDepartmentName = request.getJSON()
        try {
            respond(status: 200, responseMessage: deptService.createDept(requestBodyDepartmentName))
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }

    def updateDepartmentForm() {
        def requestBodyDepartmentId = params["id"].toInteger()
        try {
            respond(status: 200, responseMessage: deptService.getDeptById(requestBodyDepartmentId))
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }

    def updateDepartment() { //http://localhost:8080/departmentResponder/updateDepartment.json
        def requestBodyDepartmentInformation = request.getJSON()
        try {
            respond(status: 200, responseMessage: deptService.updateDept(requestBodyDepartmentInformation))
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }

    def deleteDepartment() { //http://localhost:8080/departmentResponder/deleteDepartment.json
        def requestBodyDepartmentId = request.getJSON()
        try {
            deptService.deleteDept(requestBodyDepartmentId)
            respond(status: 200, responseMessage: 'Successful deletion')
        } catch (e) {
            respond(status: 400, responseMessage: 'Failed deletion')
        }

    }
}
