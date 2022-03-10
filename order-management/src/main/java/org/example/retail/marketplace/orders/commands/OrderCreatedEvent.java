package org.example.retail.marketplace.orders.commands;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.retail.marketplace.orders.entities.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class OrderCreatedEvent {
    private final String orderId;
    private final OrderStatus orderStatus;
    private final String customerId;
    private final String shoppingCartId;
    private final BigDecimal totalCost;
    private final LocalDateTime placedAt;
    private final LocalDateTime estimatedDeliveryDate;

}
