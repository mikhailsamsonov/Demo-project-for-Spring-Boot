package com.example.demo.service;

import com.example.demo.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface ProductStatsService extends Repository<Order, Integer> {
    /*
    * SELECT userMobileNumber, SUM(id) FROM orders or
    * LEFT JOIN users u ON or.userMobileNumber = u.phoneNumber
    * WHERE u.phoneNumber IS NOT NULL products LIKE :productId GROUP BY phoneNumber
    *
    * */


    @Query("SELECT userMobileNumber, SUM(id) FROM orders WHERE products LIKE :productId GROUP BY phoneNumber")
    String findMostRecentInOrdersByProductId(String productId);
}
