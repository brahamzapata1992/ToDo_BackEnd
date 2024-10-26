package com.todo.task.Controller;

import com.todo.task.Entity.CompletedTask;
import com.todo.task.Repository.CompletedTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks/completed")
public class CompletedTaskController {

    @Autowired
    private CompletedTaskRepository completedTaskRepository;

    @GetMapping
    public List<CompletedTask> getAllCompletedTasks() {
        return completedTaskRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteCompletedTask(@PathVariable Long id) {
        completedTaskRepository.deleteById(id);
    }

}
