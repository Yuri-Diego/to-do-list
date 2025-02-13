package com.wnyuri.todolist.controllers;

import com.wnyuri.todolist.dto.taskCreateDTO;
import com.wnyuri.todolist.dto.taskDTO;
import com.wnyuri.todolist.services.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class taskController {

    @Autowired
    private taskService taskService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<taskDTO> getTasks(@PathVariable Long id) {
        taskDTO task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @GetMapping(value = "/list/{taskListId}")
    public ResponseEntity<List<taskDTO>> getTasksByTaskListId(@PathVariable Long taskListId) {
        List<taskDTO> tasks = taskService.getTasksByTaskListId(taskListId);
        return ResponseEntity.ok(tasks);
    }

    @PostMapping()
    public ResponseEntity<taskCreateDTO> createTask(@RequestBody taskCreateDTO task) {
        taskCreateDTO createdTask = taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    @PutMapping(value = "/{taskId}")
    public ResponseEntity<taskDTO> updateTask(@PathVariable Long taskId, @RequestBody taskDTO dto) {
        taskDTO updatedTask = taskService.updateTask(taskId, dto);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping(value = "/{taskId}")
    public ResponseEntity<taskDTO> deleteTask(@PathVariable Long taskId) {
        taskDTO deletedTask = taskService.deleteTask(taskId);
        return ResponseEntity.ok(deletedTask);
    }
}
