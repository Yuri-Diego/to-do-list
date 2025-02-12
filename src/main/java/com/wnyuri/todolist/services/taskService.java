package com.wnyuri.todolist.services;

import com.wnyuri.todolist.dto.taskDTO;
import com.wnyuri.todolist.entities.taskEntity;
import com.wnyuri.todolist.repositories.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class taskService {

    @Autowired
    private taskRepository taskRepository;

    @Transactional(readOnly = true)
    public taskDTO getTaskById(Long id) {
        return taskRepository.getById(id).toDTO();
    }

    @Transactional(readOnly = true)
    public List<taskDTO> getTasksByTaskListId(Long taskListId) {
        List<taskEntity> tasks = taskRepository.findByTaskListId(taskListId);
        return tasks.stream().map(taskEntity::toDTO).toList();
    }

    @Transactional
    public taskDTO createTask(taskDTO taskDTO) {
        taskEntity task = new taskEntity();
        task.setTitle(taskDTO.title());
        task.setDescription(taskDTO.description());
        task = taskRepository.save(task);

        return task.toDTO();
    }
}
