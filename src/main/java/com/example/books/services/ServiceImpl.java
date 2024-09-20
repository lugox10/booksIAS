package com.example.books.services;

import com.example.books.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;


@Service
public class ServiceImpl implements Servicios {

    @Autowired
    Repository repository;


    @Override
    public Optional<Book> findBookById(Long id) {
        return repository.findBookById(id);
    }

    @Override
    public Book updateBooks(Book book) {
        return null;
    }

    @Override
    public List<Book> findAllBooks() {
        return repository.findAllBooks();
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {
        repository.deleteById(id);
    }
}
