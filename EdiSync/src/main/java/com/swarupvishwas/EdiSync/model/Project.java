package com.swarupvishwas.EdiSync.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int teamId;
    String projectCat;
    String projectTitle;
    String projectDetails;
    int projectProgress;


    public Project() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getProjectCat() {
        return projectCat;
    }

    public void setProjectCat(String projectCat) {
        this.projectCat = projectCat;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public int getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(int projectProgress) {
        this.projectProgress = projectProgress;
    }
}
