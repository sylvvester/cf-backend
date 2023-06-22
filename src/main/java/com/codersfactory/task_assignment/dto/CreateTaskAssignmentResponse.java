package com.codersfactory.task_assignment.dto;

import java.time.Instant;

public record CreateTaskAssignmentResponse(
        Long id,
        Long taskId,
        Long userId,
        Instant deadline,
        String additionalNotes,
        Instant createdAt,
        Instant updatedAt
) {
}
