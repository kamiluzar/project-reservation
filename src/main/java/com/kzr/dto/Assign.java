package com.kzr.dto;

/**
 * Created by Kamil on 2017-07-05.
 */
public class Assign {
    private Integer studentId;
    private Integer projectId;
    private String resultProjects;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getResultProjects() {
        return resultProjects;
    }

    public void setResultProjects(String resultProjects) {
        this.resultProjects = resultProjects;
    }
}
