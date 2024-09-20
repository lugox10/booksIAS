package com.example.books.infraestructure;

import com.example.books.domain.model.Books;
import com.example.books.gateways.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.List;


@Service
public class ServiceImpl implements Service {

    private  Repository repository;

    @Autowired
    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Books findBookById(String id) {
        return repository.findBookById(id);
    }

    @Override
    public List<Books> findAllBooks() {
        return repository.findAllBooks();
    }

    @Override
    public Books save(Books book) {
        return repository.save(book);
    }


}
