package Employees

class EmployeeController {
    def empService
    def genService
    def deptService
    def editEmpId(int id) {
        def res = empService.getEmpById(id)
        def department = genService.getDept()
        if(!res) {
            render("There is no Employee with id:${id}")
            return "Error"
        }
        def defaultDepartment = deptService.getDeptById(res.dept_id[0])
        //[id,fist_name,last_name,afm,dob,dept_id]
        render(view: "editForm", model: [res: res, allDeps: department, defaultDepartment:defaultDepartment])
    }
    def updateEmployeeForm() {
        empService.updateEmp(params)
        //def res = GenService.getEmpByDept(params.dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]
        redirect(controller: 'general', action: 'showEmployees', params: [department_id: params.dept_id])
    }

    def createEmployeeForm() {
        def res = genService.getDept()
        //[id,d_name]
        render(view: "hire", model: [allDeps: res])
    }

    def createEmployee() {
        empService.createEmp(params)
        def res = genService.getEmpByDept(params.dept_id)
        redirect(controller:'general', action:'showEmployees', params:[department_id:params.dept_id])
    }

    def deleteEmployee() {
        empService.deleteEmp(params)
        def res = genService.getEmpByDept(params.dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]
        redirect(controller:'general', action:'showEmployees', params:[department_id:params.dept_id])
    }
}
