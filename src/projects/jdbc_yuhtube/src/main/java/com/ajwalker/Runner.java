package com.ajwalker;

import com.ajwalker.entity.User;
import com.ajwalker.repository.UserRepository;

public class Runner {
    public static void main(String[] args) {
        UserRepository userRepository = UserRepository.getInstance();
//        userRepository.save(new User("Alexo", "xlea@gmail.com", "4321"));
        userRepository.findAll().forEach(System.out::println);

    }
}
