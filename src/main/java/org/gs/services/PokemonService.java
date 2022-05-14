package org.gs.services;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.gs.modelo.pokemon.Pokemon;
import org.gs.proxy.PokemonProxy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PokemonService {


    @Inject
    @RestClient
    PokemonProxy pokemonProxy;

    public Pokemon pokemonRestClient(String pokemon){
        Pokemon agregarPokemon = pokemonProxy.get(pokemon);
        return agregarPokemon;
    }
}
