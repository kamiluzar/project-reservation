package com.kzr.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Kamil on 2017-07-03.
 */
@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //@NotNull
    @Column(unique = true)
    private String username;

    //@NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    //@OneToOne(mappedBy = "assignedUser")
    //private Project assignedProject;

    private boolean assignedProject;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

//    public Project getAssignedProject() {
//        return assignedProject;
//    }
    public boolean getAssignedProject() {
        return assignedProject;
    }

//    public void setAssignedProject(Project assignedProject) {
//        this.assignedProject = assignedProject;
//    }
    public void setAssignedProject(boolean assignedProject) {
        this.assignedProject = assignedProject;
    }
}
