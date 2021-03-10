package helloworld


class EmployeeController {
    def simpleService

    def index() {
        def res = simpleService.getDept()
        render(view: "list", model: [res:res])
    }
    def getEmpByDept(int table ) {
        //render table
        def res = simpleService.getEmpByDept(table)
        render(view: "empByDept", model: [res:res, dept_id:table])
    }
    def editEmpId (int id) {
        def res = simpleService.getEmpById(id)
        def department = simpleService.getDept()
        render(view:"editForm", model: [res:res, dep:department])
    }
    def saveForm() {
        simpleService.updateEmp(params)
        def res = simpleService.getEmpByDept(params.dept_id)
        //render res
        render(view: "empByDept", model: [res:res])
    }
    def hireForm() {
        def res = simpleService.getDept()
        render(view:"hire", model:[res:res])
    }
    def hire() {
        //render params
        simpleService.hireEmp(params)
        def res = simpleService.getEmpByDept(params.dept_id)
        render(view: "empByDept", model: [res:res, dept_id:params.dept_id])
    }

    def fire() {
        render params
        simpleService.fireEmp(params)
        def res = simpleService.getEmpByDept(params.dept_id)
        render(view: "empByDept", model: [res:res, dept_id:params.dept_id])
    }

}
