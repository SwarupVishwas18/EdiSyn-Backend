package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface TaskService {
    public Task saveTask(Task task);
    public List<Task> getTasksByMember(int userId);
//    public void setTaskStatus(Task task, String status);

}
