package com.example.common.constants;

/**
 * Типы команд для взаимодействия между сервисами
 */
public class CommandTypes {
    public static final String START_ORDER_SAGA = "START_ORDER_SAGA";
    public static final String PROCESS_PAYMENT = "PROCESS_PAYMENT";
    public static final String UPDATE_INVENTORY = "UPDATE_INVENTORY";
    public static final String COMPLETE_ORDER = "COMPLETE_ORDER";
    public static final String CANCEL_ORDER = "CANCEL_ORDER";
    public static final String REFUND_PAYMENT = "REFUND_PAYMENT";
    public static final String RELEASE_INVENTORY = "RELEASE_INVENTORY";
}
