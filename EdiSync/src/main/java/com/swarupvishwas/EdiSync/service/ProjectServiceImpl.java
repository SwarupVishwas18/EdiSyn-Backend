package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Project;
import com.swarupvishwas.EdiSync.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectServiceImpl implements  ProjectService {
    ProjectRepository projRepo;
    @Override
    public Project saveProject(Project project) {
        return projRepo.save(project);
    }

    @Override
    public void setProgress(int projectId, int progress) {
        projRepo.updateProgress(progress, projectId);
    }

    @Override
    public List<Project> getProjectsByUserId(int userId) {
        return projRepo.getProjectsByUser(userId);
    }

    @Override
    public Optional<Project> getProjectDetails(int id) {
        return projRepo.findById(id);
    }
}
