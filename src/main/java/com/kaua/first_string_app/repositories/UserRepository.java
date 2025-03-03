package com.kaua.first_string_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaua.first_string_app.entities.User;

// Jpa repository já tem uma implementação padrão pro tipo especifico que definirmos aqui.
public interface UserRepository extends JpaRepository<User, Long> {
}
