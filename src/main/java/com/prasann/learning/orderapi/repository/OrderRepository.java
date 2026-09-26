package com.prasann.learning.orderapi.repository;

import com.prasann.learning.orderapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
