package com.projeto.pokemon.pokemon.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.projeto.pokemon.pokemon.models.entity.TipoPokemon;

public interface TipoPokemonRepository extends CrudRepository<TipoPokemon, Integer>{

}