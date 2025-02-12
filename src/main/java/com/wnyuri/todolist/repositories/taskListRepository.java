package com.wnyuri.todolist.repositories;

import com.wnyuri.todolist.entities.taskListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskListRepository extends JpaRepository<taskListEntity, Long> {

}
