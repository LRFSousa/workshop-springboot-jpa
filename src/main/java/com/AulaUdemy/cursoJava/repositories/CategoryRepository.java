package com.AulaUdemy.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaUdemy.cursoJava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
