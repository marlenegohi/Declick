package com.example.declick.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String message;

    @Column
    private LocalDateTime dateHeure;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = true)
    private Task task;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = true)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", nullable = false)
    private User utilisateur;

}