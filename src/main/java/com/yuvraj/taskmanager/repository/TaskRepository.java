package com.yuvraj.taskmanager.repository;

import com.yuvraj.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task, Long> {
}
