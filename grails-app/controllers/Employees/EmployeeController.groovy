package Employees

class EmployeeController {
    def empService
    def deptService

    def showEmployees(int dept_id) {
        def res = empService.getEmpByDept(dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]

        def d_name = deptService.getDeptById(dept_id)
        def allEmployeesInformation = [res: res, d_name: d_name[0]]
        render(view: "ListEmployees", model: [allEmployeesInformation:allEmployeesInformation])
    }

    def editEmpId(int id) {
        def res = empService.getEmpById(id)
        def allDeps = deptService.getAllDepartments()
        if (!res) {
            render("There is no Employee with id:${id}")
            return "Error"
        }
        def defaultDepartment = deptService.getDeptById(res.dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]
        def employeeInformation = [res: res, allDeps: allDeps, defaultDepartment: defaultDepartment]
        render(view: "editForm", model: [employeeInformation:employeeInformation])
    }

    def updateEmployeeForm() {
        empService.updateEmp(params)
        //[id,fist_name,last_name,afm,dob,dept_id]
        redirect(action: 'showEmployees', params: [dept_id: params.dept_id])
    }

    def createEmployeeForm() {
        def res = deptService.getAllDepartments()
        //[id,d_name]
        render(view: "hire", model: [allDeps: res])
    }

    def createEmployee() {
        def temp = empService.createEmp(params)
        redirect(action: 'showEmployees', params: [dept_id: params.dept_id])
    }

    def deleteEmployee() {
        empService.deleteEmp(params)
        //[id,fist_name,last_name,afm,dob,dept_id]
        redirect(action: 'showEmployees', params: [dept_id: params.dept_id])
    }
}
