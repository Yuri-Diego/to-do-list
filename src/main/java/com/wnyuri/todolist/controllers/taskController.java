package com.wnyuri.todolist.controllers;

import com.wnyuri.todolist.dto.taskDTO;
import com.wnyuri.todolist.services.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
