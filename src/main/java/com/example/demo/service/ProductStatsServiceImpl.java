package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ProductStatsServiceImpl implements ProductStatsService {


    private final OrderRepository orderRepository;

    public ProductStatsServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public String findMostRecentInOrdersByProductId(String productId) {
        return orderRepository.findPhoneNumberByProductsIn(productId);
    }
}
