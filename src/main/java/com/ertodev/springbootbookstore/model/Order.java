package com.ertodev.springbootbookstore.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table
@Getter
@Setter
@Data
@Builder
@Entity(name = "bookOrder")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String   userName;

    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> bookIdList;

    private Double totalPrice;

}
