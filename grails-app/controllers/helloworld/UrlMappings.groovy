package helloworld

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:'logReg', action:'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
        //"/varif/$id?"(controller: 'logReg', action: 'varif')

    }
}
