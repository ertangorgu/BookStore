package com.ertodev.springbootbookstore.service;


import com.ertodev.springbootbookstore.model.Book;
import com.ertodev.springbootbookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService extends Book{



    private final BookRepository bookRepository;

    public BookService( BookRepository bookRepository) {


        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){

        return bookRepository.findById(bookId);
    }
    public Book putAndBook(String name, String author, Double price, Integer stock ){
        Book book = Book.builder()
                .name(name)
                .author(author)
                .price(price)
                .stock(stock)
                .build();
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
