package com.ertodev.springbootbookstore.repository;

import com.ertodev.springbootbookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
