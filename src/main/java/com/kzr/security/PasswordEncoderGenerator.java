package com.kzr.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Kamil on 2017-07-03.
 */
public class PasswordEncoderGenerator {
    public static String generatePass(String password) {
        String hashedPass = "";
        for (int i = 0; i < 10; i++) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            hashedPass = passwordEncoder.encode(password);
        }
        return hashedPass;
    }
}