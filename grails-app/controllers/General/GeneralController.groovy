package General

class GeneralController {
    def genService

    def showDepartments() {
        def res = genService.getDept()
        //[id, d_name]
        render(view: "ListDepartments", model: [res: res])
    }

    def showEmployees(int dept_id) {
        def res = genService.getEmpByDept(dept_id)
        //[id,fist_name,last_name,afm,dob,dept_id]

        def d_name = genService.getDeptById(dept_id)
        def allEmployeesInformation = [res: res, d_name: d_name[0]]
        render(view: "ListEmployees", model: [allEmployeesInformation:allEmployeesInformation])
    }


}
