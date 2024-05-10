package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Project;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Modifying
    @Transactional
    @Query("UPDATE Project p SET p.projectProgress = ?1 WHERE p.id = ?2")
    public void updateProgress(int progress, int projectId);

    @Query("SELECT p FROM Project p WHERE p.teamId IN (SELECT t.id FROM Team t WHERE t.member1Id = ?1 or t.member2Id = ?1 or t.member3Id = ?1 or t.member4Id = ?1 or t.leaderId = ?1 or t.guideId = ?1)")
    public List<Project> getProjectsByUser(int userId);
}
