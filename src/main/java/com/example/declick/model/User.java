package com.example.declick.model;

import jakarta.persistence.*;
import com.example.declick.model.Task;


import java.util.List;

@Entity
@Table(name = "utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nom;

    @Column
    private String email;

    @OneToMany(mappedBy = "utilisateur")
    private List<Task> taches;



}
