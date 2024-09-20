package com.example.books.gateways.repository;

import com.example.books.domain.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface Repository extends JpaRepository<Books,Long> {

    Books findBookById(String id);

    List<Books> findAllBooks();
}
