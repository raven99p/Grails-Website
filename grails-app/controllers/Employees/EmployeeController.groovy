package Employees

class EmployeeController {
    def empService
    def deptService

    def showEmployees(int departmentId) {
        def allEmployeesofDepartment = empService.getEmpByDept(departmentId)
        def departmentName = deptService.getDeptById(departmentId)
        def allEmployeesInformation = [allEmployeesofDepartment: allEmployeesofDepartment, departmentName: departmentName[0]]
        [allEmployeesInformation: allEmployeesInformation]
    }

    def editEmployee(int employeeId) {
        def employeeInformation = empService.getEmpById(employeeId)
        def allDepartments = deptService.getAllDepartments()
        if (!employeeInformation) {
            render("There is no Employee with id:${employeeId}")
            return "Error"
        }
        def defaultDepartment = deptService.getDeptById(employeeInformation.departmentId)
        def TotalInformation = [employeeInformation: employeeInformation, allDepartments: allDepartments, defaultDepartment: defaultDepartment]
        [TotalInformation: TotalInformation]
    }

    def updateEmployeeForm() {
        empService.updateEmp(params)
        redirect(action: 'showEmployees', params: [departmentId: params.departmentId])
    }

    def createEmployeeForm() {
        def allDepartments = deptService.getAllDepartments()
        [allDepartments: allDepartments]
    }

    def createEmployee() {
        empService.createEmp(params)
        redirect(action: 'showEmployees', params: [departmentId: params.departmentId])
    }

    def deleteEmployee() {
        empService.deleteEmp(params)
        redirect(action: 'showEmployees', params: [departmentId: params.departmentId])
    }
}
