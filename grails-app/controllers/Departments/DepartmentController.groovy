package Departments

class DepartmentController {
    def deptService

    def showDepartments() {
        def allDepartments = deptService.getAllDepartments()
        [allDepartments: allDepartments]
    }

    def createDeptForm() {
    }

    def createDept() {
        deptService.createDept(params)
        redirect(action: 'showDepartments')
    }

    def updateDeptForm() {
        def departmentInformation = [departmentId: params.departmentId, departmentName: params.departmentName]
        [departmentInformation: departmentInformation]
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
