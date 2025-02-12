package com.wnyuri.todolist.controllers;

import com.wnyuri.todolist.dto.taskListDTO;
import com.wnyuri.todolist.services.taskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/task-lists")
public class taskListController {

    @Autowired
    private taskListService taskService;

    @GetMapping()
    public ResponseEntity<List<taskListDTO>> getTaskLists() {
        List<taskListDTO> taskLists = taskService.getAllTaskLists();
        return ResponseEntity.ok(taskLists);
    }

    @PostMapping()
    public ResponseEntity<taskListDTO> createTaskList() {
        taskListDTO createdTask = taskService.createTaskList();
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }
}
