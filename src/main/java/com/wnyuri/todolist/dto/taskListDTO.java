package com.wnyuri.todolist.dto;

import java.time.LocalDateTime;

public record taskListDTO(
        Long id,
        LocalDateTime created
) {
}
