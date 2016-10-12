package com.github.soulaway.springsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.soulaway.springsite.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
