package com.kzr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by Kamil on 2017-07-03.
 */

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @NotNull
    private String theme;

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

    public boolean getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(boolean assignedUser) {
         this.assignedUser = assignedUser;
     }
}
