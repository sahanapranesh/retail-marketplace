package org.example.retail.marketplace.orders;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order {
    private double orderId;
    private double customerId;
    private double addressId;
    private double shoppingCartId;
    private BigDecimal totalCost;
    private LocalDateTime placedAt;
    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime deliveredAt;
    private OrderStatus orderStatus;

    public Order(double customerId, double addressId, double shoppingCartId, BigDecimal totalCost) {
        this.customerId = customerId;
        this.addressId = addressId;
        this.shoppingCartId = shoppingCartId;
        this.totalCost = totalCost;
        this.orderId = Math.random();
        this.placedAt = LocalDateTime.now();
        this.orderStatus = OrderStatus.ORDERED;
        this.estimatedDeliveryDate = estimateDeliveryDate();
    }

    private LocalDateTime estimateDeliveryDate() {
        return LocalDateTime.now().plusDays(2);
    }

    public void updateOrderStatus(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
    }

    public void updateDeliveryDate(LocalDateTime deliveryDate){
        this.estimatedDeliveryDate = deliveryDate;
    }
}
