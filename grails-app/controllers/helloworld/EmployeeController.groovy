package helloworld


class EmployeeController {
    def simpleService

    def index() {
        def res = simpleService.getDept()
        render(view: "list", model: [res: res])
    }
    //////////////////////////////////////
    def getEmpByDept(int table) {
        //render table
        def res = simpleService.getEmpByDept(table)
        //[id,fist_name,last_name,afm,dob,dept_id]
        def d_name = simpleService.getDeptById(table)
        render(view: "empByDept", model: [res: res, dept_id: table, d_name: d_name[0]])
    }

    def editEmpId(int id) {
        def res = simpleService.getEmpById(id)
        def department = simpleService.getDept()
        //[id,fist_name,last_name,afm,dob,dept_id]
        render(view: "editForm", model: [res: res, allDeps: department])
    }
    //////////////////////////////////////
    def updateEmployeeForm() {
        //render params
        simpleService.updateEmp(params)
        def res = simpleService.getEmpByDept(params.dept_id)
        //render res
        //[id,fist_name,last_name,afm,dob,dept_id]
        redirect(controller: 'employee', action: 'getEmpByDept', params: [table: params.dept_id])
        //render(view: "empByDept", model: [res:res])
    }

    def createEmployeeForm() {
        def res = simpleService.getDept()
        //[id,d_name]
        render(view: "hire", model: [allDeps: res])
    }

    def createEmployee() {
        //render params
        simpleService.createEmp(params)
        def res = simpleService.getEmpByDept(params.dept_id)
        render(view: "empByDept", model: [res: res, dept_id: params.dept_id])
    }

    def deleteEmployee() {
        //render params
        simpleService.deleteEmp(params)
        def res = simpleService.getEmpByDept(params.dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]
        render(view: "empByDept", model: [res: res, dept_id: params.dept_id])
    }
    //////////////////////////////////////////////
    def createDeptForm() {
        render(view: "buildDept")
    }

    def createDept() {
        //render params
        simpleService.createDept(params)
        redirect(controller: 'employee')
    }

    def updateDeptForm() {
        //render params
        render(view: "updateDept", model: [dept_id: params.d_id, d_name: params.d_name])

    }

    def updateDept() {
        simpleService.updateDept(params)
        redirect(controller: 'employee')

    }

    def deleteDept() {
        simpleService.deleteDept(params)
        redirect(controller: 'employee')
    }


}
