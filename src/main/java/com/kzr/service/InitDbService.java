package com.kzr.service;

import com.kzr.repository.ProjectRepository;
import com.kzr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Kamil on 2017-07-04.
 */

@Service
public class InitDbService {

    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;

    @Autowired
    public InitDbService(UserRepository userRepository, ProjectRepository projectRepository) {
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
    }

//    @PostConstruct
//    public void init() {
//        User admin = new User();
//        admin.setUsername("admin");
//        admin.setPassword("$2a$10$92z1CjNPWjfulqDaT4.EdulFdbZnbrpP3n2mi/QGdT0fNSRHWAAkS");
//        admin.setRole(Role.ROLE_ADMIN);
//        userRepository.save(admin);
//
//        User user = new User();
//        user.setUsername("user");
//        user.setPassword("$2a$10$p1JKUtqztfQnFF.3rc1g7eccqAaQa25SNvkOTv/WznUwz8edtFkk.");
//        user.setRole(Role.ROLE_USER);
//        userRepository.save(user);
//
//        Project project1 = new Project();
//        project1.setTheme("Bookstore management system");
//        project1.setAssignedUser(false);
//        projectRepository.save(project1);
//    }


}
