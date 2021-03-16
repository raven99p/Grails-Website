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
        render(view: "ListEmployees", model: [res: res, dept_id: dept_id, d_name: d_name[0]])
    }


}
