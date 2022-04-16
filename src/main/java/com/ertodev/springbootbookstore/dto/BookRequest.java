package com.ertodev.springbootbookstore.dto;

import lombok.Data;

@Data
public class BookRequest {
    private String name;
    private String author;
    private Double price;
    private Integer stock;


}
