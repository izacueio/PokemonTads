package com.projeto.pokemon.pokemon.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.projeto.pokemon.pokemon.models.entity.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{

}