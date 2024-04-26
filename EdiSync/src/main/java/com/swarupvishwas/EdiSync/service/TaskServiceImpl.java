package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Task;
import com.swarupvishwas.EdiSync.repository.TaskRepository;

import java.util.ArrayList;

public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepo;


    @Override
    public Task saveTask(Task task) {
        return taskRepo.save(task);
    }

    @Override
    public ArrayList<Task> getTasksByMember(int userId) {
        return taskRepo.getTasksByUser(userId);
    }

    @Override
    public void setTaskStatus(Task task, String status) {
        taskRepo.updateStatus(task.getId(), status);
    }
}
