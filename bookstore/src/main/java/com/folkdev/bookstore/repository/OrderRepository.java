package com.folkdev.bookstore.repository;

import com.folkdev.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
