package com.codersfactory.task.dto;

import com.codersfactory.common.entity.DifficultyLevel;
import lombok.Builder;

import java.time.Duration;
import java.time.Instant;
@Builder
public record TaskResponseDto(
        Long taskId,
        String title,
        String content,
        String exampleSolution,
        String hint,
        int numberOfPoints,
        DifficultyLevel difficultyLevel,
        Long creatorId,
        Instant createdAt,
        Instant updatedAt,
        Duration averageCompletionTime,
        String technology,
        String tests
) {
}
