package com.example.post.query.domain.dto;

public record KafkaStatus<T>(
        T data,
        String status
) {
}
