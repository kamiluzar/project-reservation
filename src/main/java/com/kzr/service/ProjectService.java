package com.kzr.service;

import com.kzr.model.Project;
import com.kzr.model.Role;
import com.kzr.model.User;
import com.kzr.repository.ProjectRepository;
import com.kzr.repository.UserRepository;
import com.kzr.security.LogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by Kamil on 2017-07-04.
 */
@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository, UserRepository userRepository) {
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public void deleteProject(Integer id) {
        projectRepository.delete(projectRepository.findOne(id));
    }

    public void assignUser(Integer id) {
        String sql = "UPDATE project SET assigned_user="+1+" WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void cancel(Integer id) {
        //int random = (int) (Math.random()*5)+3;
        String sql = "UPDATE project SET assigned_user="+0+" WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}