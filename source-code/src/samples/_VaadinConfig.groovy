
vaadin {

    // Your Vaadin application class that extends com.vaadin.Application:
    applicationClasses = ["com.mycompany.MyVaadinApplication"]

	// This is optional, GrailsAwareApplicationServlet is provided by default. Use this if you need to add or change application servlet. 
	// You should extend GrailsAwareApplicationServlet or GrailsAwareGAEApplicationServlet (from com.vaadin.grails.terminal.gwt.server package).
	// servletClass = "com.mycompany.MyGrailsAwareApplicationServlet"
	
    autowire = "byName" //how should dependencies be injected? other option is 'byType'

    // The context relative path where you want to access your Vaadin UI. Default is the context root.
    contextRelativePaths = ["/"]
              
    productionMode = false

    googleAppEngineMode = false

    reloadOnVaadinClassChange = false
}

environments {
    production {
        vaadin {
            productionMode = true
        }
    }
}
