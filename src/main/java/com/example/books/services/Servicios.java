package com.example.books.services;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public interface Servicios {


    Optional<Book> findBookById(Long id);

    Book updateBooks(Book book);

    List<Book> findAllBooks();

    public Book save(Book book);

    void deleteBookById(Long id);

}
