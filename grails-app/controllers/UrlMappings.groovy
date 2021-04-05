class UrlMappings {

    static mappings = {
        "/"(controller: 'authentication', action: 'login')
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }
        post "/authenticationResponder/verify"(controller:'authenticationResponder', action: 'verify')
        get "/authenticationResponder/logout"(controller:'authenticationResponder', action: 'logout')
        get "/authenticationResponder/getSessionVariable"(controller:'authenticationResponder', action: 'getSessionVariable')

        get "/departmentResponder/getDepartments"(controller:'departmentResponder', action:'getDepartments')
        post "/departmentResponder/postDepartment"(controller: 'departmentResponder', action:'postDepartment')
        put "/departmentResponder/updateDepartment"(controller: 'departmentResponder', action: 'updateDepartment')
        delete "/departmentResponder/deleteDepartment"(controller: 'departmentResponder', action: 'deleteDepartment')
        get "/departmentResponder/updateDepartmentForm/"(controller: 'departmentResponder', action: 'updateDepartmentForm' )

        get "/employeeResponder/getEmployees/"(controller: 'employeeResponder', action: 'getEmployees')
        post "/employeeResponder/postEmployee"(controller: 'employeeResponder', action: 'postEmployees')
        put "/employeeResponder/updateEmployee"(controller: 'employeeResponder', action: 'updateEmployee')
        delete "/employeeResponder/deleteEmployee"(controller: 'employeeResponder', action: 'deleteEmployee')
        get "/employeeResponder/updateEmployeeForm/"(controller: 'employeeResponder', action: 'updateEmployeeForm')

        "500"(view: '/error')
        "404"(view: '/notFound')


    }
}
