package Departments

class DepartmentController {
    def deptService

    def showDepartments() {
        def res = deptService.getAllDepartments()
        //[id, d_name]
        render(view: "ListDepartments", model: [res: res])
    }

    def createDeptForm() {
        render(view: "buildDept")
    }

    def createDept() {
        deptService.createDept(params)
        redirect(action: 'showDepartments')
    }

    def updateDeptForm() {
        def departmentInformation = [d_id: params.d_id, d_name: params.d_name]
        render(view: "updateDept", model: [departmentInformation:departmentInformation])
    }

    def updateDept() {
        deptService.updateDept(params)
        redirect(action: 'showDepartments')
    }

    def deleteDept() {
        deptService.deleteDept(params)
        redirect(action: 'showDepartments')
    }
}
