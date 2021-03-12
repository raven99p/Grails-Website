package Departments

class DepartmentController {
    def DeptService

    def createDeptForm() {
        render(view: "buildDept")
    }

    def createDept() {
        DeptService.createDept(params)
        redirect(controller: 'General', action:'showDepartments')
    }

    def updateDeptForm() {
        render(view: "updateDept", model: [dept_id: params.d_id, d_name: params.d_name])
    }

    def updateDept() {
        DeptService.updateDept(params)
        redirect(controller: 'General', action:'showDepartments')
    }

    def deleteDept() {
        DeptService.deleteDept(params)
        redirect(controller: 'General', action:'showDepartments')
    }
}
