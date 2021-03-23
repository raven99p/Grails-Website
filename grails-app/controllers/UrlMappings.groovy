class UrlMappings {

    static mappings = {
        "/"(controller: 'authentication', action: 'login')
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        get "/departmentResponder/getDepartments(.$format)"(controller:'departmentResponder', action:'getDepartments')
        get "/employeeResponder/getEmployees/$departmentId(.$format)"(controller: 'employeeResponder', action: 'getEmployees')
        get "/authenticationResponder/varify(.$format)"(controller:'authenticationResponder', action: 'varify')

        post "/departmentResponder/postDepartment(.$format)"(controller: 'departmentResponder', action:'postDepartment')


        "500"(view: '/error')
        "404"(view: '/notFound')


    }
}
