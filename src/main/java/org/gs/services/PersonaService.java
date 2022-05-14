package org.gs.services;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.gs.modelo.persona.Persona;
import org.gs.proxy.PersonaProxy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PersonaService {

    @Inject
    @RestClient
    PersonaProxy personaProxy;

    public Persona personaRestClient(Persona persona){
        Persona agregarPersona = personaProxy.post(persona);
        return agregarPersona;
    }
}
