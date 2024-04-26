package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
