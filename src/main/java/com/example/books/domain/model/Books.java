package com.example.books.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "books")
public class Books {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String titulo;
    @Column
    private String genero;
    @Column
    private char ISBN;
    @Column
    private String fechaPublicacion;
    @Column
    private int precio;

    @OneToMany
    private String autor;


}
