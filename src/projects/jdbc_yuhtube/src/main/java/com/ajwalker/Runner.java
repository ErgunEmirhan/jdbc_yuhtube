package com.ajwalker;

import com.ajwalker.entity.User;
import com.ajwalker.repository.UserRepository;

import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        UserRepository userRepository = UserRepository.getInstance();
//        userRepository.save(new User("Alexo", "xlea@gmail.com", "4321"));
//        userRepository.findAll().forEach(System.out::println);
        userRepository.softDelete(3L);
//        Optional<User> userOptional = userRepository.findById(5L);
//        if (userOptional.isPresent()) {
//            User user = userOptional.get();
//            user.setPassword("321");
//            user.setEmail("karaca@gmail.com");
//            user.setUsername("kekeke");
//            userRepository.update(user);
//        }

    }
}
