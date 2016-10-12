package com.github.soulaway.springsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.soulaway.springsite.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
