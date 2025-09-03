package com.example.common.constants;

/**
 * Типы событий для взаимодействия между сервисами
 */
public class EventTypes {
    public static final String PAYMENT_PROCESSED = "PAYMENT_PROCESSED";
    public static final String PAYMENT_FAILED = "PAYMENT_FAILED";
    public static final String PAYMENT_REFUNDED = "PAYMENT_REFUNDED";
    public static final String INVENTORY_UPDATED = "INVENTORY_UPDATED";
    public static final String INVENTORY_UPDATE_FAILED = "INVENTORY_UPDATE_FAILED";
    public static final String INVENTORY_RELEASED = "INVENTORY_RELEASED";
    public static final String ORDER_CREATED = "ORDER_CREATED";
    public static final String ORDER_COMPLETED = "ORDER_COMPLETED";
    public static final String ORDER_CANCELLED = "ORDER_CANCELLED";

    private EventTypes() {}
}