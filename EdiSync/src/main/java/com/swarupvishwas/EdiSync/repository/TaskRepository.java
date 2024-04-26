package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Query("SELECT * FROM Team WHERE assignedId = ?1")
    public ArrayList<Task> getTasksByUser(int userId);

    @Query("UPDATE Task SET status = ?2 WHERE taskId = ?1")
    public ArrayList<Task> updateStatus(int taskId, String status);
}
