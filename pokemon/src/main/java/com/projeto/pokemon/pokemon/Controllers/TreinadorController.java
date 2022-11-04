package com.projeto.pokemon.pokemon.controllers;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.pokemon.pokemon.models.dto.TreinadorDTO;
import com.projeto.pokemon.pokemon.models.entity.Treinador;
import com.projeto.pokemon.pokemon.models.dto.TreinadorRepository;

@RestController
@RequestMapping("/Treinadores")
public class TreinadorController{
    
    @Autowired
    TreinadorRepository treinadorRepository;

    @GetMapping
    public ResponseEntity<Object> getAllTreinadores(){
        return ResponseEntity.status(HttpStatus.OK).body(treinadorRepository.findAll());

    }
    @PostMapping
    puib
}
