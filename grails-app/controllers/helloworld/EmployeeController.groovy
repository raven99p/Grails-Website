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
}
