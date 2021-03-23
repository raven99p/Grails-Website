class UrlMappings {

    static mappings = {
        "/"(controller: 'authentication', action: 'login')
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }
        get "/authenticationResponder/verify(.$format)"(controller:'authenticationResponder', action: 'verify')
        get "/authenticationResponder/logout(.$format)"(controller:'authenticationResponder', action: 'logout')


        get "/employeeResponder/getEmployees/$departmentId(.$format)"(controller: 'employeeResponder', action: 'getEmployees')


        get "/departmentResponder/getDepartments(.$format)"(controller:'departmentResponder', action:'getDepartments')
        post "/departmentResponder/postDepartment(.$format)"(controller: 'departmentResponder', action:'postDepartment')
        put "/departmentResponder/updateDepartment(.$format)"(controller: 'departmentResponder', action: 'updateDepartment')
        delete "/departmentResponder/deleteDepartment(.$format)"(controller: 'departmentResponder', action: 'deleteDepartment')
        "500"(view: '/error')
        "404"(view: '/notFound')


    }
}
