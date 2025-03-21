package com.example.declick.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titre;

    @Column
    private String description;

    @Column
    private LocalDateTime dateHeure;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private User utilisateur;


    @OneToMany(mappedBy = "event")
    private List<Notification> notifications;
}
