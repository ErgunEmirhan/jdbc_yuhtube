package com.ajwalker.controller;

import com.ajwalker.entity.Video;
import com.ajwalker.repository.VideoRepository;
import com.ajwalker.service.VideoService;

import java.util.List;
import java.util.Optional;

public class VideoController {
    private final static VideoRepository videoRepository = VideoRepository.getInstance();
    private static VideoController instance;

    private VideoController(){
    }

    private VideoController getInstance() {
        if (instance == null){
            instance = new VideoController();
        }
        return instance;
    }

    public boolean save(Video video) {
        return videoRepository.save(video);
    }

    public boolean update(Video video) {
        return videoRepository.update(video);
    }

    public boolean delete(Long id) {
        return videoRepository.delete(id);
    }

    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    public Optional<Video> findById(Long id) {
        return videoRepository.findById(id);
    }
}
