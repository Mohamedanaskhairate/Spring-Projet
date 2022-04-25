package com.example.demo.entities;

import java.util.Date;

import javax.persistence.*;
import lombok.*;


@Entity //c pour dire que cette class coresp a une table dans la bd
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Livre
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titre")
    private String titre;
    private String maisonEdition;
    private Date dateSortie;
    private String auteur;
    private int nombreDePage;
    private String ISBN;
    private Date dateConstruction;
    private boolean disponible;
}