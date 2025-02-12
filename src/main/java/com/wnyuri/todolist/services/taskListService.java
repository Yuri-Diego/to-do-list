package com.wnyuri.todolist.services;

import com.wnyuri.todolist.dto.taskDTO;
import com.wnyuri.todolist.entities.taskEntity;
import com.wnyuri.todolist.repositories.taskListRepository;
import com.wnyuri.todolist.repositories.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class taskListService {

    @Autowired
    private taskListRepository taskListRepository;



}
