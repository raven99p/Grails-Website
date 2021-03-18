package Departments

class DepartmentController {
    def deptService

    def showDepartments() {
        def allDepartments = deptService.getAllDepartments()
        //[departmentId,departmentName]
        render(view: "ListDepartments", model: [allDepartments: allDepartments])
    }

    def createDeptForm() {
        render(view: "buildDept")
    }

    def createDept() {
        deptService.createDept(params)
        redirect(action: 'showDepartments')
    }

    def updateDeptForm() {
        def departmentInformation = [departmentId: params.departmentId, departmentName: params.departmentName]
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
