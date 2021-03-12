package Employees

class EmployeeController {
    def EmpService
    def GenService
    def editEmpId(int id) {
        def res = EmpService.getEmpById(id)
        def department = GenService.getDept()
        //[id,fist_name,last_name,afm,dob,dept_id]
        render(view: "editForm", model: [res: res, allDeps: department])
    }
    def updateEmployeeForm() {
        EmpService.updateEmp(params)
        def res = GenService.getEmpByDept(params.dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]
        redirect(controller: 'General', action: 'showEmployees', params: [department_id: params.dept_id])
    }

    def createEmployeeForm() {
        def res = GenService.getDept()
        //[id,d_name]
        render(view: "hire", model: [allDeps: res])
    }

    def createEmployee() {
        EmpService.createEmp(params)
        def res = GenService.getEmpByDept(params.dept_id)
        redirect(controller:'General', action:'showEmployees', params:[department_id:params.dept_id])
    }

    def deleteEmployee() {
        EmpService.deleteEmp(params)
        def res = GenService.getEmpByDept(params.dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]
        redirect(controller:'General', action:'showEmployees', params:[department_id:params.dept_id])
    }
}
