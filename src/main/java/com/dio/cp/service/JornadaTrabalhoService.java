//REGRAS DE NEGOCIO


package com.dio.cp.service;

import com.dio.cp.model.JornadaTrabalho;
import com.dio.cp.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired //Instancia nova classe automaticamente
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(long id) {
        return jornadaTrabalhoRepository.findById(id);
    }

    public void delete(long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }
}
