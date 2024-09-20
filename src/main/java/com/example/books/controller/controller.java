package com.example.books.controller;

import com.example.books.services.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private ServiceImpl service;

    public controller(ServiceImpl service) {
        this.service = service;
    }

    public void getBooks() {
        service.findAllBooks();
    }

    public void getBookById(Long id) {
        service.findBookById(id);
    }

    public void saveBook() {
        service.save(null);
    }

    public void updateBook() {
        service.updateBooks(null);
    }

    public void deleteBook(Long id) {
        service.deleteBookById(id);
    }

    
}
