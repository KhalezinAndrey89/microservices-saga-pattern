package com.example.common.config;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

/**
 * Конфигурационные константы для Kafka
 */
public class KafkaConfig {
    public static final String STRING_SERIALIZER = StringSerializer.class.getName();
    public static final String STRING_DESERIALIZER = StringDeserializer.class.getName();
    public static final String JSON_SERIALIZER = JsonSerializer.class.getName();
    public static final String JSON_DESERIALIZER = JsonDeserializer.class.getName();

    // Trusted packages для десериализации
    public static final String TRUSTED_PACKAGES = "com.example.common.dto,com.example.common.model";

    // Topics
    public static final String TOPIC_ORDER_COMMANDS = "order-commands";
    public static final String TOPIC_PAYMENT_COMMANDS = "payment-commands";
    public static final String TOPIC_INVENTORY_COMMANDS = "inventory-commands";
    public static final String TOPIC_ORDER_EVENTS = "order-events";
    public static final String TOPIC_PAYMENT_EVENTS = "payment-events";
    public static final String TOPIC_INVENTORY_EVENTS = "inventory-events";
    public static final String TOPIC_SAGA_EVENTS = "saga-events";

    private KafkaConfig() {}
}
