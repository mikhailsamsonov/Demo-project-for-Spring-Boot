package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.ProductStatsService;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    private final ProductStatsService productStatsService;

    public ProductController(ProductStatsService productStatsService) {
        this.productStatsService = productStatsService;
    }

    @RequestMapping(value = "/product/topByUser/{id}", method = RequestMethod.GET)
    public User userWithFavoriteProductId(@PathVariable Integer id) {
        return productStatsService.findMostRecentInOrdersByProductId(id);
    }

}
