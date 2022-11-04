package com.projeto.pokemon.pokemon.models.dto;

import javax.swing.Spring;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class PokemonDTO{

    private String nome;
    private Integer Altura;
    private Integer Peso;
    private List<Integer> habilidades;
    private List<Integer> fraquezas;
    private List<Integer> TipoPokemons;
}