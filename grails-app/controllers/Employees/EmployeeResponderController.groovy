package Employees

class EmployeeResponderController {

    def empService
    def deptService

    def getEmployees(params) { //http://localhost:8080/employeeResponder/getEmployees/9.json
        def departmentId = params.departmentId.toInteger()
        def allEmployeesofDepartment = empService.getEmpByDept(departmentId)
        def departmentName = deptService.getDeptById(departmentId)
        def message = [allEmployeesofDepartment:allEmployeesofDepartment, departmentName:departmentName]
        respond message
    }

    def updateEmployee() {
        respond empService.updateEmp(params)

    }

    def postEmployee() {
        //respond empService.createEmp(params)
        respond params

    }

    def deleteEmployee() {
        respond empService.deleteEmp(params)

    }
}
