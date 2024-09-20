package com.example.books.infraestructure;

import com.example.books.domain.model.Books;
import com.example.books.gateways.repository.Repository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public interface Service {
    Optional<Books> findBookById(Long id);
    List<Books> findAllBooks();
    public Book save(Book book);
}
