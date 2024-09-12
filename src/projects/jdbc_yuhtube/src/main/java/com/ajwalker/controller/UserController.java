package com.ajwalker.controller;

import com.ajwalker.entity.User;
import com.ajwalker.repository.UserRepository;
import com.ajwalker.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserController {
    private static final UserService userService = UserService.getInstance();
    private static UserController instance;

    private UserController() {}

    private UserController getInstance() {
        if (instance == null){
            instance = new UserController();
        }
        return instance;
    }

    public boolean save(User user) {
        return userService.save(user);
    }

    public boolean update(User user) {
        return userService.update(user);
    }

    public boolean delete(Long id) {
        return userService.delete(id);
    }

    public List<User> findAll() {
        return userService.findAll();
    }

    public Optional<User> findById(Long id) {
        return userService.findById(id);
    }
}
