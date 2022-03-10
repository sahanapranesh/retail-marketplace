package org.example.retail.marketplace.orders.commands;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.retail.marketplace.orders.entities.OrderStatus;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class OrderCreatedEvent {
    private final String orderId;
    private final OrderStatus orderStatus;
    private final double customerId;
    private final double shoppingCartId;
    private final BigDecimal totalCost;

}
