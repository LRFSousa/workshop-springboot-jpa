package com.AulaUdemy.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaUdemy.cursoJava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
