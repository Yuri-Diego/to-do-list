package com.wnyuri.todolist.services;

import com.wnyuri.todolist.repositories.taskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class taskListService {

    @Autowired
    private taskListRepository taskListRepository;


}
