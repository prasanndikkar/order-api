package com.prasann.learning.orderapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/orders")
public class OrderController {
    
    @GetMapping
    public String getOrders() {
        return "Orders API is running";
    }
}
