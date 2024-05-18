package com.example.demo.Entity;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.util.Set;

@Entity
public class Project {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "project_user",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> members;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
