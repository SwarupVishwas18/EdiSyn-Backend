package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Query("UPDATE Project SET projectProgress = ?1 WHERE id = ?2")
    public void updateProgress(int progress, int projectId);

    @Query("SELECT * FROM Project WHERE teamId=(SELECT * FROM Team WHERE member1Id = ?1 or member2Id = ?1 or member3Id = ?1 or member4Id = ?1 or leaderId = ?1 or guideId = ?1)")
    public ArrayList<Project> getProjectsByUser(int userId);
}
