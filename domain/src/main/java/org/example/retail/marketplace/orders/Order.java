package org.example.retail.marketplace.orders;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {
    private int orderId;
    private int customerId;
    private int addressId;
    private List<Product> products;
    private BigDecimal totalCost;
    private LocalDateTime placedAt;
    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime deliveredAt;
    private OrderStatus orderStatus;
}
