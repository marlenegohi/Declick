package com.example.declick.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTask;

    @Column
    private String titre;

    @Column
    private String description;

    @Column
    private String etat;


    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private User utilisateur;

    @OneToMany(mappedBy = "task")
    private List<Notification> notifications;
}
