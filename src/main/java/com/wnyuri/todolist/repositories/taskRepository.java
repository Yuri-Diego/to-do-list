package com.wnyuri.todolist.repositories;

import com.wnyuri.todolist.entities.taskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface taskRepository extends JpaRepository<taskEntity, Long> {
    List<taskEntity> findByTaskListId(Long taskListId);
}
