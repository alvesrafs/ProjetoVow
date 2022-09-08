package com.example.agendaMecanica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agendaMecanica.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
