package com.AulaUdemy.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaUdemy.cursoJava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
