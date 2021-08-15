//INTERFACE PARA RECEBER AS REQUISIÇÕES


package com.dio.cp.controller;

import com.dio.cp.model.JornadaTrabalho;
import com.dio.cp.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController //Retorna um JSON
@RequestMapping("/jornada") //Caminho na url
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping //Executa um POST
    public JornadaTrabalho save(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @GetMapping //Executa um GET
    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping(path ={"/{id}"})//Executa um GET enviando um parametro pela URL
    public ResponseEntity findById(@PathVariable long id) {
        return jornadaTrabalhoService.findById(id).map(value -> ResponseEntity.ok().body(value)).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity <?> delete(@PathVariable long id) {
        return jornadaTrabalhoService.findById(id).map(value -> {jornadaTrabalhoService.delete(id); return ResponseEntity.ok().build();}).orElse(ResponseEntity.notFound().build());
    }
}
