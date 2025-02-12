package com.wnyuri.todolist.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_task_list")
public class taskListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime created;

    @OneToMany(mappedBy = "taskList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<taskEntity> tasks = new ArrayList<>();

    public taskListEntity() {}

    public taskListEntity(long id, List<taskEntity> tasks) {
        this.id = id;
        this.tasks = tasks;
        this.created = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getCreated() {
        return created;
    }


    public List<taskEntity> getTasks() {
        return tasks;
    }

    public void setTasks(List<taskEntity> tasks) {
        this.tasks = tasks;
    }
}
