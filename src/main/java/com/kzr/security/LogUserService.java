package com.kzr.security;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by Kamil on 2017-07-04.
 */

public class LogUserService {

    public static String getCurrentlyUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
