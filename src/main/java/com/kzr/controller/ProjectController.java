package com.kzr.controller;

import com.kzr.model.Project;
import com.kzr.repository.ProjectRepository;
import com.kzr.repository.UserRepository;
import com.kzr.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Kamil on 2017-07-04.
 */
@Controller
public class ProjectController {

    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    private final ProjectService projectService;

    @Autowired
    public ProjectController(UserRepository userRepository, ProjectRepository projectRepository, ProjectService projectService) {
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
        this.projectService = projectService;
    }

    @RequestMapping(value = "/add-project", method = RequestMethod.GET)
    public String getProjectPanel(Model model) {
        model.addAttribute("projectForm", new Project());
        return "/add-project";
    }

    @RequestMapping(value = "/add-project", method = RequestMethod.POST)
    public String addProject(@ModelAttribute(value="projectForm") @Valid Project project) {
        projectService.addProject(project);
        String redirectUrl = "/about";
        return "redirect:" + redirectUrl;
    }

    @RequestMapping(value = "/assignUser", method = RequestMethod.POST)
    public String assignUser(@RequestParam(value="theme", defaultValue = "") String id){
        Integer idInt = Integer.parseInt(id);
        projectService.assignUser(idInt);
        String redirectUrl = "/about";
        return "redirect:" + redirectUrl;
    }

    @RequestMapping(value = "/cancel", method = RequestMethod.POST)
    public String cancel(@RequestParam(value="theme", defaultValue = "") String id){
        Integer idInt = Integer.parseInt(id);
        projectService.cancel(idInt);
        String redirectUrl = "/about";
        return "redirect:" + redirectUrl;
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String getListOfProjects(Model model) {
        List<Project> themeOfProjects = projectRepository.findAll();
        model.addAttribute("result", themeOfProjects);
        return "/about";
    }

    @RequestMapping(value = "/delete-theme", method = RequestMethod.POST)
    public String deleteTheme(@RequestParam(value="theme", defaultValue = "") String id) {
        Integer idInt = Integer.parseInt(id);
        projectService.deleteProject(idInt);
        String redirectUrl = "/about";
        return "redirect:" + redirectUrl;
    }
}
