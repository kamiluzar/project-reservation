package com.kzr.repository;

import com.kzr.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kamil on 2017-07-04.
 */
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
