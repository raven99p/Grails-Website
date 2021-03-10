package helloworld


class EmployeeController {
    def simpleService

    def index() {
        def res = simpleService.getDept()
        render(view: "list", model: [res:res])
    }
    def getEmpByDept(int table ) {
        def res = simpleService.getEmpByDept(table)
        render(view: "empByDept", model: [res:res])
    }
    def editEmpId (int id) {
        def res = simpleService.getEmpById(id)
        render(view:"editForm", model: [res:res])
    }
    def saveForm() {
        simpleService.updateEmp(params)
        def res = simpleService.getEmpByDept(params.dept_id)
        render(view: "empByDept", model: [res:res])
    }
}
