package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface ProjectService {
    public Project saveProject(Project project);

    public void setProgress(int projectId, int progress);

    public ArrayList<Project> getProjectsByUserId(int userId);

    public Optional<Project> getProjectDetails(int id);
}
