package Departments

class DepartmentController {
    def deptService
    def empService

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
        def employeesInDepartment = empService.getEmpByDept(params.departmentId)
        if (employeesInDepartment) {
            flash.message = "Δεν μπορεί να διαγραφεί, λόγο ενεργών υπαλλήλων"
            redirect(action: 'showDepartments')
        }
        else{
            deptService.deleteDept(params)
            redirect(action: 'showDepartments')
        }

    }
}
