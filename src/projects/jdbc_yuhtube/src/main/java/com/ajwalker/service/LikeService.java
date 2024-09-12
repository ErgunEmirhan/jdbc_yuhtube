package com.ajwalker.service;

import com.ajwalker.database.DatabaseHelper;
import com.ajwalker.entity.Like;
import com.ajwalker.repository.LikeRepository;
import com.ajwalker.utility.ICRUD;

import java.util.List;
import java.util.Optional;

public class LikeService {
    private static final LikeRepository likeRepository = LikeRepository.getInstance();
    private static LikeService instance;

    private LikeService() {}

    public static LikeService getInstance() {
        if (instance == null) {
            instance = new LikeService();
        }
        return instance;
    }

    public boolean save(Like like) {
        return likeRepository.save(like);
    }

    public boolean update(Like like) {
        return likeRepository.update(like);
    }

    public boolean delete(Long id) {
        return likeRepository.delete(id);
    }

    public List<Like> findAll() {
        return likeRepository.findAll();
    }

    public Optional<Like> findById(Long id) {
        return likeRepository.findById(id);
    }
}
