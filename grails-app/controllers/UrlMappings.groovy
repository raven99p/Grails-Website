class UrlMappings {

    static mappings = {
        "/"(controller: 'authentication', action: 'login')
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }


        "500"(view: '/error')
        "404"(view: '/notFound')


    }
}
