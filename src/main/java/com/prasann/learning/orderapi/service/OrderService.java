package com.prasann.learning.orderapi.service;
import org.springframework.stereotype.Service;
import com.prasann.learning.orderapi.model.Order;
import com.prasann.learning.orderapi.repository.OrderRepository;

@Service 
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    
    public Order createOrder(String customerName, String status) {
        Order order = new Order(null, customerName, status);
        return orderRepository.save(order);
    }

    public Order getOrder(Long id){
        return orderRepository.findById(id) .orElseThrow(() -> new RuntimeException("Order not found: " + id));
    }

}