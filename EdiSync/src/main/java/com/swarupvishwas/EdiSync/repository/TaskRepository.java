package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Query("SELECT t FROM Task t WHERE t.assignedId = ?1")
    public List<Task> getTasksByUser(int userId);

    @Transactional
    @Modifying
    @Query("UPDATE Task t SET t.status = ?1 WHERE t.id = ?2")
    public void updateStatus( String status, int taskId);
}
