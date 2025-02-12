package com.wnyuri.todolist.entities;

import com.wnyuri.todolist.dto.taskDTO;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_task")
public class taskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String description;
    private Boolean done;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private taskListEntity taskList;

    public taskEntity() {}

    public taskEntity(int id, String title, String description, boolean done, taskListEntity taskList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
        this.taskList = taskList;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public taskListEntity getTaskList() {
        return taskList;
    }

    public void setTaskList(taskListEntity taskList) {
        this.taskList = taskList;
    }

    public taskDTO toDTO() {
        return new taskDTO(this.title, this.description, this.done);
    }
}
