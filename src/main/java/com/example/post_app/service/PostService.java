package com.example.post_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.post_app.entity.Post;
import com.example.post_app.entity.User;
import com.example.post_app.form.PostEditForm;
import com.example.post_app.form.PostRegisterForm;
import com.example.post_app.repository.PostRepository;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findPostsByUserOrderedByCreatedAtDesc(User user) {
        return postRepository.findByUserOrderByCreatedAtDesc(user);
    }
    
    public Optional<Post> findPostById(Integer id) {
        return postRepository.findById(id);
    }
    
    @Transactional
    public void createPost(PostRegisterForm postRegisterForm, User user) {
        Post post = new Post();

        post.setTitle(postRegisterForm.getTitle());
        post.setContent(postRegisterForm.getContent());
        post.setUser(user);

        postRepository.save(post);
    }
    
    @Transactional
    public void updatePost(PostEditForm postEditForm, Post post) {
        post.setTitle(postEditForm.getTitle());
        post.setContent(postEditForm.getContent());

        postRepository.save(post);
    }
    
    @Transactional
    public void deletePost(Post post) {
        postRepository.delete(post);
    }
}
