package com.example.post_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.post_app.entity.Post;
import com.example.post_app.entity.User;

public interface PostRepository extends JpaRepository<Post, Integer> {
	public List<Post> findByUserOrderByCreatedAtDesc(User user);
}
