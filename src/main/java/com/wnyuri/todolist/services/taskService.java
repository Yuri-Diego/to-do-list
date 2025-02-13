package com.wnyuri.todolist.services;

import com.wnyuri.todolist.dto.taskCreateDTO;
import com.wnyuri.todolist.dto.taskDTO;
import com.wnyuri.todolist.entities.taskEntity;
import com.wnyuri.todolist.entities.taskListEntity;
import com.wnyuri.todolist.repositories.taskRepository;
import com.wnyuri.todolist.repositories.taskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class taskService {

    @Autowired
    private taskRepository taskRepository;

    @Autowired
    private taskListRepository taskListRepository;

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
    public taskCreateDTO createTask(taskCreateDTO newTask) {
        taskListEntity taskList = taskListRepository.findById(newTask.taskListId())
                .orElseThrow(() -> new RuntimeException("Task list não encontrada"));

        taskEntity task = new taskEntity();
        task.setTitle(newTask.title());
        task.setDescription(newTask.description());
        task.setDone(newTask.done());
        task.setTaskList(taskList);

        taskRepository.save(task);
        return task.toCreateDTO();
    }

    @Transactional
    public taskDTO updateTask(Long taskId, taskDTO dto) {
        taskEntity task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(dto.title());
        task.setDescription(dto.description());
        task.setDone(dto.done());

        taskRepository.save(task);
        return task.toDTO();
    }

    @Transactional
    public taskDTO deleteTask(Long taskId) {
        taskDTO deletedTask = taskRepository.getById(taskId).toDTO();
        taskRepository.deleteById(taskId);
        return deletedTask;
    }
}
