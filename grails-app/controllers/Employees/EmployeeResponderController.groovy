package Employees

class EmployeeResponderController {

    def empService
    def deptService

    def getEmployees() { //http://localhost:8080/employeeResponder/getEmployees/9.json
        def departmentId = params["id"].toInteger()
        def allEmployeesofDepartment = empService.getEmpByDept(departmentId)
        def departmentName = deptService.getDeptById(departmentId)
        def message = [allEmployeesofDepartment:allEmployeesofDepartment, departmentName:departmentName]
        respond (status: 200, messageResponse:message)
    }

    def updateEmployee() { //http://localhost:8080/employeeResponder/updateEmployee.json
        def updatedEmployeeInformation= empService.updateEmp(request.getJSON())
        respond (status: 200, messageResponse:updatedEmployeeInformation)
    }

    def postEmployee() { //http://localhost:8080/employeeResponder/postEmployee.json
        def createdEmployeeInformation = empService.createEmp(request.getJSON())
        respond (status: 200, messageResponse:createdEmployeeInformation)

    }

    def deleteEmployee() { //http://localhost:8080/employeeResponder/deleteEmployee.json
        def deletedEmployeeInformation = empService.deleteEmp(request.getJSON())
        respond (status: 200, messageResponse:deletedEmployeeInformation)
    }
}
