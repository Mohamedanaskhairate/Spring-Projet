package com.example.demo.controller;

import com.example.demo.entities.Livre;
import com.example.demo.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LivreController
{
    @Autowired
    private LivreService livreService;

    @GetMapping(path="emsi_api/livres")
    public List<Livre> listeLivres()
    {
        return livreService.listLivre();
    }

    @GetMapping(path = "emsi_api/livre/{id}")
    public Livre retournerLivre(@PathVariable Integer id)
    {
        return livreService.retournerLivre(id);
    }

    @PostMapping(path = "emsi_api/livres")
    public Livre ajouterLivre(Livre livre)
    {
        return livreService.ajouterLivre(livre);
    }

    @PutMapping(path="emsi_api/livres")
    public Livre modifierLivre(Livre livre)
    {
        return livreService.modifierLivre(livre);
    }

    @DeleteMapping(path="emsi_api/livre/{id}")
    public String supprimerLivre(@PathVariable Integer id)
    {
        livreService.supprimerLivre(id);
        return "Le livre avec le id : " + id + " a ete supprimer avec succes";
    }
}
