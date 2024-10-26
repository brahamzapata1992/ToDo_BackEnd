package com.todo.task.Repository;

import com.todo.task.Entity.CompletedTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompletedTaskRepository extends JpaRepository<CompletedTask, Long> {
}
