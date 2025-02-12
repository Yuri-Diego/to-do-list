package com.wnyuri.todolist.repositories;

import com.wnyuri.todolist.entities.taskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<taskEntity, Long> {

}
