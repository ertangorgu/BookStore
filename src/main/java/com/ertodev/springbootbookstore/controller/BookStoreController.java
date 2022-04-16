package com.ertodev.springbootbookstore.controller;


import com.ertodev.springbootbookstore.dto.BookOrderRequest;
import com.ertodev.springbootbookstore.dto.BookRequest;
import com.ertodev.springbootbookstore.model.Book;
import com.ertodev.springbootbookstore.model.Order;
import com.ertodev.springbootbookstore.service.BookService;
import com.ertodev.springbootbookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= {"v1/bookstore", "", "/", })


public class BookStoreController {
    private final OrderService orderService;
    private final BookService bookService;

    public BookStoreController(OrderService orderService, BookService bookService) {
        this.orderService = orderService;
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> bookList = bookService.getAllBooks();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orderList = orderService.getAllOrders();
        return ResponseEntity.ok(orderList);
    }

    /*@PostMapping
    public ResponseEntity <Order> putAndOrder(@RequestBody BookOrderRequest bookOrderRequest){

        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUserName());
        return ResponseEntity.ok(order);*/
    @PostMapping
    public ResponseEntity <Book> putAndBook(@RequestBody BookRequest bookRequest){
        Book book = bookService.putAndBook(bookRequest.getName(),
               bookRequest.getAuthor(), bookRequest.getPrice(),bookRequest.getStock() );
       return ResponseEntity.ok(book);
   }



    }




