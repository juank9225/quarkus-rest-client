package org.gs.resource;

import org.gs.modelo.pokemon.Pokemon;
import org.gs.services.PokemonService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pokemon")
public class PokemonResources {

    @Inject
    PokemonService proxy;

    private List<Pokemon> tvSeries = new ArrayList<>();

    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSeries(@QueryParam("nombre") String nombre){
        tvSeries.clear();
        Pokemon pokemon = proxy.pokemonRestClient(nombre);
        tvSeries.add(pokemon);
        return Response.ok(tvSeries).build();
    }
}
