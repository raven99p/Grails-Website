package Departments

class DepartmentController {
    def deptService

    def createDeptForm() {
        render(view: "buildDept")
    }

    def createDept() {
        deptService.createDept(params)
        redirect(controller: 'general', action: 'showDepartments')
    }

    def updateDeptForm() {
        def departmentInformation = [d_id: params.d_id, d_name: params.d_name]
        render(view: "updateDept", model: [departmentInformation:departmentInformation])
    }

    def updateDept() {
        deptService.updateDept(params)
        redirect(controller: 'general', action: 'showDepartments')
    }

    def deleteDept() {
        deptService.deleteDept(params)
        redirect(controller: 'general', action: 'showDepartments')
    }
}
