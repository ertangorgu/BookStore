package com.ertodev.springbootbookstore.repository;

import com.ertodev.springbootbookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
