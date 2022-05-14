package org.gs.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.gs.modelo.pokemon.Pokemon;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/pokemon/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(baseUri = "https://pokeapi.co/api/v2")
public interface PokemonProxy {

    @GET
    @Path("/{name}")
    Pokemon get(@PathParam("name") String name);
}
