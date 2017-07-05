package com.kzr.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Kamil on 2017-07-03.
 */

@Entity
@Getter
@Setter
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @NotNull
    private String theme;

    //@OneToOne
    //private User assignedUser;

    private boolean assignedUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

//    public User getAssignedUser() {
//        return assignedUser;
//    }
    public boolean getAssignedUser() {
        return assignedUser;
    }

//    public void setAssignedUser(User assignedUser) {
//        this.assignedUser = assignedUser;
//    }

    public void setAssignedUser(boolean assignedUser) {
         this.assignedUser = assignedUser;
     }
}
