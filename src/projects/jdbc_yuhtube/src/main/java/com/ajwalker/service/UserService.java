package com.ajwalker.service;

import com.ajwalker.entity.User;
import com.ajwalker.repository.UserRepository;
import com.ajwalker.utility.ICRUD;

import java.util.List;
import java.util.Optional;

public class UserService {
    private static final UserRepository userRepository = UserRepository.getInstance();
    private static UserService instance;

    private UserService() {}

    public static UserService getInstance() {
        if (instance == null){
            instance = new UserService();
        }
        return instance;
    }

    public boolean save(User user) {
        return userRepository.save(user);
    }

    public boolean update(User user) {
        return userRepository.update(user);
    }

    public boolean delete(Long id) {
        return userRepository.delete(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }


}
