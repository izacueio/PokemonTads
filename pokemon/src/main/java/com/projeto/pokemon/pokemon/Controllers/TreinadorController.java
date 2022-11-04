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
    public ResponseEntity<Object> saveAuthor(@RequestBody TreinadorDTO treinadorDTO){
        Treinador treinadorEntity = new Treinador();
        BeanUtils.copyProperties(treinadorDTO, treinadorEntity);

        return ResponseEntity.status(HttpStatus.OK).body(treinadorRepository.save(treinadorEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTreinador(@PathVariable Integer id, @RequestBody TreinadorDTO treinadorDTO){
        Optional<Treinador> treinadorExists = treinadorRepository.findById(id);

        if(!treinadorExists.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Treinador não encontrado.");
        }

        Treinador treinadorEntity = treinadorExists.get();

        BeanUtils.copyProperties(treinadorDTO, treinadorEntity);

        return ResponseEntity.status(HttpStatus.OK).body(treinadorRepository.save(treinadorEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTreinador(@PathVariable Integer id){
        Optional<Treinador> treinadorEntity = treinadorRepository.findById(id);

        if(!treinadorEntity.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Treinador não encontrado.");
        }

        treinadorRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Treinador Deletado.");
    }


  

}
