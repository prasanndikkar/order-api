package com.prasann.learning.orderapi.service;
import org.springframework.stereotype.Service;
import com.prasann.learning.orderapi.model.Order;

@Service 
public class OrderService {
    
    public Order getOrder(Long id){
        return new Order(id, "Customer 1","PROCESSING");
    }

}