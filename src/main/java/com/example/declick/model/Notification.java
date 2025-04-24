package com.example.declick.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private LocalDateTime sendDateTime;

    @ManyToOne
    @JoinColumn(name = "planning_id")
    private Planning planning;

    // Getters and setters
}
