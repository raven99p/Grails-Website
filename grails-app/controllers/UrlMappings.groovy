class UrlMappings {

    static mappings = {
        "/"(controller: 'authentication', action: 'login')
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }
        post "/authenticationResponder/verify(.$format)"(controller:'authenticationResponder', action: 'verify')
        get "/authenticationResponder/logout(.$format)"(controller:'authenticationResponder', action: 'logout')


        get "/departmentResponder/getDepartments(.$format)"(controller:'departmentResponder', action:'getDepartments')
        post "/departmentResponder/postDepartment(.$format)"(controller: 'departmentResponder', action:'postDepartment')
        put "/departmentResponder/updateDepartment(.$format)"(controller: 'departmentResponder', action: 'updateDepartment')
        delete "/departmentResponder/deleteDepartment(.$format)"(controller: 'departmentResponder', action: 'deleteDepartment')
        get "/departmentResponder/updateDepartmentForm/(.$format)"(controller: 'departmentResponder', action: 'updateDepartmentForm' )

        get "/employeeResponder/getEmployees/(.$format)"(controller: 'employeeResponder', action: 'getEmployees')
        post "/employeeResponder/postEmployee(.$format)"(controller: 'employeeResponder', action: 'postEmployees')
        put "/employeeResponder/updateEmployee(.$format)"(controller: 'employeeResponder', action: 'updateEmployee')
        delete "/employeeResponder/deleteEmployee(.$format)"(controller: 'employeeResponder', action: 'deleteEmployee')
        get "/employeeResponder/updateEmployeeForm(.$format)"(controller: 'employeeResponder', action: 'updateEmployeeForm')

        "500"(view: '/error')
        "404"(view: '/notFound')


    }
}
