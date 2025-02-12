package com.wnyuri.todolist.dto;

public record taskDTO(
        String title,
        String description,
        Boolean done
) {
}
