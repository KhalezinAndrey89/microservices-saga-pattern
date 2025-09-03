package com.example.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Базовый класс для команд между сервисами
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    private UUID eventId;
    private String type;
    private UUID sagaId;
    private Object payload;
    private LocalDateTime timestamp;
    private String sourceService;

    public Event(String type, UUID sagaId, Object payload, String sourceService) {
        this.eventId = UUID.randomUUID();
        this.type = type;
        this.sagaId = sagaId;
        this.payload = payload;
        this.timestamp = LocalDateTime.now();
        this.sourceService = sourceService;
    }
}
