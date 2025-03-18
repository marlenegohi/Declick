package com.example.declick.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titre;

    @Column
    private String description;

    @Column
    private String etat;


    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private User utilisateur;


}
