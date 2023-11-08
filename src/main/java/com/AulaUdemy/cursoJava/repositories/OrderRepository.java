package com.AulaUdemy.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaUdemy.cursoJava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
