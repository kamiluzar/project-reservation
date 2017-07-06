package com.kzr.service;

import com.kzr.model.Role;
import com.kzr.model.User;
import com.kzr.repository.UserRepository;
import com.kzr.security.PasswordEncoderGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Kamil on 2017-07-03.
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        user.setRole(Role.ROLE_USER);
        user.setPassword(PasswordEncoderGenerator.generatePass(user.getPassword()));
        userRepository.save(user);
    }
}