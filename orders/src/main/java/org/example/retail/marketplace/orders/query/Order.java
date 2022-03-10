package org.example.retail.marketplace.orders.query;

import lombok.Data;
import org.example.retail.marketplace.orders.entities.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order {
    private String orderId;
    private double customerId;
    private double shoppingCartId;
    private BigDecimal totalCost;
    private LocalDateTime placedAt;
    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime deliveredAt;
    private OrderStatus orderStatus;

    public Order(String orderId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }
}
