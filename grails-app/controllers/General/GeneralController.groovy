package General

class GeneralController {
    def genService

    def showDepartments() {
        def res = genService.getDept()
        //[id, d_name]
        render(view: "ListDepartments", model: [res: res])
    }

    def showEmployees(int department_id) {
        def res = genService.getEmpByDept(department_id)
        //[id,fist_name,last_name,afm,dob,dept_id]

        def d_name = genService.getDeptById(department_id)
        render(view: "ListEmployees", model: [res: res, dept_id: department_id , dept_name: d_name[0]])
    }


}
