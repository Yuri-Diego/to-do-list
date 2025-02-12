package com.wnyuri.todolist.services;

import com.wnyuri.todolist.dto.taskDTO;
import com.wnyuri.todolist.dto.taskListDTO;
import com.wnyuri.todolist.entities.taskEntity;
import com.wnyuri.todolist.entities.taskListEntity;
import com.wnyuri.todolist.repositories.taskListRepository;
import com.wnyuri.todolist.repositories.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class taskListService {

    @Autowired
    private taskListRepository taskListRepository;

    public List<taskListDTO> getAllTaskLists() {
        List<taskListDTO> taskListDTOS = new ArrayList<>();
        taskListRepository.findAll().forEach(taskList -> {taskListDTOS.add(taskList.toDTO());});
        return taskListDTOS;
    }

    public taskListDTO createTaskList() {
        taskListEntity taskList = new taskListEntity();
        taskList = taskListRepository.save(taskList);

        return taskList.toDTO();
    }

}
