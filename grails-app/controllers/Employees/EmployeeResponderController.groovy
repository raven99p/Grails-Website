package Employees

class EmployeeResponderController {

    def empService
    def deptService
    def employeeResponderService

    def getEmployees() { //http://localhost:8080/employeeResponder/getEmployees/9.json
        def departmentId = params["id"].toInteger()
        def allEmployeesofDepartment = empService.getEmpByDept(departmentId)
        def departmentInformation = deptService.getDeptById(departmentId)
        def message = [allEmployeesofDepartment:allEmployeesofDepartment, departmentInformation:departmentInformation]
        respond (status: 200, messageResponse:message)
    }

    def updateEmployeeForm() {
        def employeeId = params["id"].toInteger()
        def allDepartments = deptService.getAllDepartments()
        def employeeInformation = empService.getEmpById(employeeId)
        def FormInformation = [employeeInformation:employeeInformation, allDepartments: allDepartments]
        respond(status: 200, responseMessage: FormInformation)
    }

    def updateEmployee() { //http://localhost:8080/employeeResponder/updateEmployee.json
        def updatedEmployeeInformation= employeeResponderService.updateEmp(request.getJSON())
        respond (status: 200, messageResponse:updatedEmployeeInformation)
    }

    def postEmployee() { //http://localhost:8080/employeeResponder/postEmployee.json
        def createdEmployeeInformation = employeeResponderService.createEmployee(request.getJSON())
        respond (status: 200, messageResponse:createdEmployeeInformation)
    }

    def deleteEmployee() { //http://localhost:8080/employeeResponder/deleteEmployee.json
        def deletedEmployeeInformation = empService.deleteEmp(request.getJSON())
        respond (status: 200, messageResponse:deletedEmployeeInformation)
    }
}
