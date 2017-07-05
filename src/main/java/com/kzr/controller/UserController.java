package com.kzr.controller;

import com.kzr.model.User;
import com.kzr.repository.ProjectRepository;
import com.kzr.repository.UserRepository;
import com.kzr.service.ProjectService;
import com.kzr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Kamil on 2017-07-03.
 */

@Controller
public class UserController {

    private final UserService userService;
    private final ProjectRepository projectRepository;

    @Autowired
    public UserController(UserService userService, ProjectService projectService, UserRepository userRepository, ProjectRepository projectRepository, ProjectRepository projectRepository1) {
        this.userService = userService;
        this.projectRepository = projectRepository;
    }

    @GetMapping("/")
    public String home1() {
        return "/home";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/home";
    }

    @GetMapping("/user")
    public String user() {
        return "/home";
    }

//    @GetMapping("/about")
//    public String about() {
//        return "/about";
//    }
//@RequestMapping(value = "/about", method = RequestMethod.GET)
//public String about (Model model) throws SQLException, ClassNotFoundException {
//    LinkedList result = projectService.readDB();
//    model.addAttribute("result", result);
//    return "about";
//}



    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getUserPanel() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUser(@ModelAttribute(value = "userForm") @Valid User user){
        userService.addUser(user);
        return "redirect:/";
    }









//
//
//    @RequestMapping(value = "/add-project", method = RequestMethod.GET)
//    public String getProjectPanel(Model model) {
//        model.addAttribute("projectForm", new Project());
//        return "add-project";
//    }
//
//    @RequestMapping(value = "/add-project", method = RequestMethod.POST)
//    public String addProject(@ModelAttribute(value="projectForm") @Valid Project project) {
//        projectService.addProject(project);
//        return "redirect:/";
//    }
}