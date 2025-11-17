package com.yuvraj.taskmanager.service;

import com.yuvraj.taskmanager.model.Task;
import com.yuvraj.taskmanager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Long id,Task updateTask){
        Task task = taskRepository.findById(id).orElse(null);
        if(task == null) return null;
        task.setTitle(updateTask.getTitle());
        task.setPriority(updateTask.getPriority());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
