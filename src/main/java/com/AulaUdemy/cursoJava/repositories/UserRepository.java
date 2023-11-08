package com.AulaUdemy.cursoJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaUdemy.cursoJava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
