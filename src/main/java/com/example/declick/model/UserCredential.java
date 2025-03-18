package com.example.declick.model;

import jakarta.persistence.*;

@Entity
class UserCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    // Utilise un champ sécurisé pour le mot de passe, par exemple un hash
    private String passwordHash;

    @OneToOne
    @JoinColumn(name = "id")
    private User utilisateur;

    // Getters and Setters
}
