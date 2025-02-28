package it.its.maven.prova.controller;


import it.its.maven.prova.entity.InfoStudente;
import it.its.maven.prova.service.InfoStudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/studenti") 
public class InfoStudenteController {

    @Autowired
    private InfoStudenteService service;

    // Mostra la form per aggiungere un nuovo studente
    @GetMapping("/aggiungi")
    public String mostraFormAggiungiStudente(Model model) {
        model.addAttribute("studente", new InfoStudente()); // Aggiunge un oggetto vuoto alla view
        return "studenti-form"; // Deve corrispondere al file HTML in /templates/
    }

    // Salva il nuovo studente nel database
    @PostMapping("/aggiungi")
    public String aggiungiStudente(@ModelAttribute("studente") InfoStudente studente) {
        service.salvaStudente(studente);
        return "redirect:/studenti"; // Dopo il salvataggio, reindirizza alla lista
    }

    // Mostra la lista degli studenti
    @GetMapping
    public String mostraStudenti(Model model) {
        List<InfoStudente> studenti = service.getAllStudenti();
        model.addAttribute("studenti", studenti);
        return "studenti-list"; // Deve corrispondere al file HTML in /templates/
    }
}