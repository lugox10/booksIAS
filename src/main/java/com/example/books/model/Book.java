package com.example.books.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@Entity
@NoArgsConstructor
public class Book {

    @Id
    private Long id;
    private String titulo;
    private String genero;
    private char ISBN;
    private String fechaPublicacion;
    private int precio;
    private String autorES;



}
