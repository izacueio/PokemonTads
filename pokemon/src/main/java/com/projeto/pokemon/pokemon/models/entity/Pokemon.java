package com.projeto.pokemon.pokemon.models.entity;

import java.lang.annotation.Inherited;
import java.persistence.*;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(nullable = false)
    private String nome;
    private Integer Altura;
    private Integer Peso;

    @ManytoOne
    @JoinColumn(name = "treinador_id")
    private Treinador treinador;

    
    @JsonBackReference
    @ManyToMany(mappedBy = "pokemons", fetch = FetchType.LAZY)
    private List<Treinador> treinadores = new ArrayList<Treinador>();
    
    @JsonBackReference
    @ManyToMany(mappedBy = "pokemons", fetch = FetchType.LAZY)
    private List<Fraqueza> fraquezas = new ArrayList<Fraqueza>();


    @JsonBackReference
    @ManyToMany(mappedBy = "pokemons", fetch = FetchType.LAZY)
    private List<Habilidade> habilidades = new ArrayList<Habilidade>();
    
}
