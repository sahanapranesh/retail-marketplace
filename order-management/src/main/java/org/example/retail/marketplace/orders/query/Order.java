package org.example.retail.marketplace.orders.query;

import lombok.Data;
import org.example.retail.marketplace.orders.entities.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order {
    private String orderId;
    private String customerId;
    private String shoppingCartId;
    private BigDecimal totalCost;
    private LocalDateTime placedAt;
    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime deliveredAt;
    private OrderStatus orderStatus;

    public Order(String orderId, String customerId, String shoppingCartId, BigDecimal totalCost, LocalDateTime placedAt,
                 LocalDateTime estimatedDeliveryDate, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.shoppingCartId = shoppingCartId;
        this.totalCost = totalCost;
        this.placedAt = placedAt;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.orderStatus = orderStatus;
    }
}
