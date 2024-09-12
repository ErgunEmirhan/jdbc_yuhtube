package com.ajwalker.service;

import com.ajwalker.entity.UserComment;
import com.ajwalker.repository.CommentRepository;

import java.util.List;
import java.util.Optional;

public class CommentService {
    private static final CommentRepository commentRepository = CommentRepository.getInstance();
    private static CommentService instance;

    private CommentService(){}

    public static CommentService getInstance(){
        if (instance == null){
            instance = new CommentService();
        }
        return instance;
    }

    public boolean save(UserComment userComment) {
        return commentRepository.save(userComment);
    }

    public boolean update(UserComment userComment) {
        return commentRepository.update(userComment);
    }

    public boolean delete(Long id) {
        return commentRepository.delete(id);
    }

    public List<UserComment> findAll() {
        return commentRepository.findAll();
    }

    public Optional<UserComment> findById(Long id) {
        return commentRepository.findById(id);
    }
}
