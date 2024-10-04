package com.example.post_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.post_app.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
	public Role findByName(String name);
}
