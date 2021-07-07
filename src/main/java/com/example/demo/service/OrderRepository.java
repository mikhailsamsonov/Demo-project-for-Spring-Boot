package com.example.demo.service;

import com.example.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    String findPhoneNumberByProductsIn(String productId);

}
