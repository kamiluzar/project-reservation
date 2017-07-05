package com.kzr.repository;

import com.kzr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kamil on 2017-07-03.
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String username);
}
