package com.wnyuri.todolist.dto;

public record taskCreateDTO(
        String title,
        String description,
        Boolean done,
        Long taskListId
) {
}
