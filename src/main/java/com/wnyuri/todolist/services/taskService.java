package com.wnyuri.todolist.services;

import com.wnyuri.todolist.dto.taskDTO;
import com.wnyuri.todolist.repositories.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class taskService {

    @Autowired
    private taskRepository taskRepository;

    @Transactional(readOnly = true)
    public taskDTO getTaskById(Long id) {
        return taskRepository.getById(id).toDTO();
    }
}
