package org.gs.resource;


import org.gs.modelo.persona.Persona;
import org.gs.services.PersonaService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/persona")
public class PersonaResources {

    @Inject
    PersonaService personaService;

    @POST
    @Path("/crear")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona postTermino(Persona persona){
        Persona respuesta = personaService.personaRestClient(persona);
        return respuesta;
    }
}
