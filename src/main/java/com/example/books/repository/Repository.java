package com.example.books.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;


public interface Repository extends JpaRepository<Book,Long> {
    Optional<Book> findBookById(Long id);
    List<Book> findAllBooks();
    public Book save(Book book);
}
