package Employees

class EmployeeResponderController {

    def empService
    def deptService
    def employeeResponderService

    def getEmployees() { //http://localhost:8080/employeeResponder/getEmployees/9.json
        try {
            def departmentId = params["id"].toInteger()
            def allEmployeesofDepartment = empService.getEmpByDept(departmentId)
            def departmentInformation = deptService.getDeptById(departmentId)
            def message = [allEmployeesofDepartment: allEmployeesofDepartment, departmentInformation: departmentInformation]
            respond(status: 200, responseMessage: message)
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }

    }

    def updateEmployeeForm() {
        try {
            def employeeId = params["id"].toInteger()
            def allDepartments = deptService.getAllDepartments()
            def employeeInformation = empService.getEmpById(employeeId)
            def FormInformation = [employeeInformation: employeeInformation, allDepartments: allDepartments]
            respond(status: 200, responseMessage: FormInformation)
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }

    def updateEmployee() { //http://localhost:8080/employeeResponder/updateEmployee.json
        try {
            def updatedEmployeeInformation = employeeResponderService.updateEmp(request.getJSON())
            respond(status: 200, responseMessage: updatedEmployeeInformation)
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }

    def postEmployee() { //http://localhost:8080/employeeResponder/postEmployee.json
        try {
            def createdEmployeeInformation = employeeResponderService.createEmployee(request.getJSON())
            respond(status: 200, responseMessage: createdEmployeeInformation)
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }

    def deleteEmployee() { //http://localhost:8080/employeeResponder/deleteEmployee.json
        try {
            def deletedEmployeeInformation = empService.deleteEmp(request.getJSON())
            respond(status: 200, responseMessage: deletedEmployeeInformation)
        } catch (e) {
            respond(status: 400, responseMessage: null)
        }
    }
}
