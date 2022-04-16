package com.ertodev.springbootbookstore.model;


import lombok.*;

import javax.persistence.*;


@Table
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;
    private String author;
    private Double price;
    private Integer stock;



}
