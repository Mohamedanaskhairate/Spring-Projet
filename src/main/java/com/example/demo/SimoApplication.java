package com.example.demo;

import com.example.demo.entities.Livre;
import com.example.demo.services.LivreService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SimoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimoApplication.class, args);
    }


    @Bean
    CommandLineRunner start(LivreService livreService)
    {
        return args -> {
            livreService.ajouterLivre(new Livre(null,
                    "titre du livre1","maisonEdition1",new Date(),
                    "auteur1",100,"ISBN1",new Date(),true));

            livreService.ajouterLivre(new Livre(null,
                    "titre du livre2","maisonEdition2",new Date(),
                    "auteur2",200,"ISBN2",new Date(),false));

            livreService.ajouterLivre(new Livre(null,
                    "titre du livre3","maisonEdition3",new Date(),
                    "auteur3",300,"ISBN3",new Date(),true));

            livreService.ajouterLivre(new Livre(null,
                    "titre du livre4","maisonEdition4",new Date(),
                    "auteur4",400,"ISBN4",new Date(),false));
        };
    }
}
