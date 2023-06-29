package com.codersfactory.tag;

import lombok.Builder;

import java.time.Instant;

@Builder
public record TagResponse(
        Long id,
        String value,
        Instant createdAt) {
}
