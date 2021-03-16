package General

class GeneralController {
    def GenService

    def showDepartments() {
        def res = GenService.getDept()
        //[id, d_name]
        render(view: "ListDepartments", model: [res: res])
    }

    def showEmployees(int department_id) {
        def res = GenService.getEmpByDept(department_id)
        //[id,fist_name,last_name,afm,dob,dept_id]

        def d_name = GenService.getDeptById(department_id)
        render(view: "ListEmployees", model: [res: res, dept_id: department_id , dept_name: d_name[0]])
    }


}
