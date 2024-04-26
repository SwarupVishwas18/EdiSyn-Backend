package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
