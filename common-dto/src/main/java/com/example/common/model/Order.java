package com.example.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private UUID id;
    private UUID customerId;
    private Double amount;
    private String status;
    private UUID productId;
    private Integer quantity;
    private String customerEmail;
    private String shippingAddress;

    public static Order createPendingOrder(UUID customerId, Double amount, UUID productId, Integer quantity) {
        Order order = new Order();
        order.setId(UUID.randomUUID());
        order.setCustomerId(customerId);
        order.setAmount(amount);
        order.setProductId(productId);
        order.setQuantity(quantity);
        order.setStatus("PENDING");
        return order;
    }
}
