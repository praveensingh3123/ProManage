package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

}
