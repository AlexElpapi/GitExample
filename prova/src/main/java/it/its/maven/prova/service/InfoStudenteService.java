package it.its.maven.prova.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.its.maven.prova.entity.InfoStudente;
import it.its.maven.prova.repository.InfoStudenteRepository;

@Service
public class InfoStudenteService {

    @Autowired
    private InfoStudenteRepository repository;

    public InfoStudente salvaStudente(InfoStudente studente) {
        return repository.save(studente);
    }
    
    public List<InfoStudente> getAllStudenti() {
        return repository.findAll();
    }
}