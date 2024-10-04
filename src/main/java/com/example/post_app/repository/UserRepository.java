package com.example.post_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.post_app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmail(String email);
}
