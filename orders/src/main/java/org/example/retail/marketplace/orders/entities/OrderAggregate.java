package org.example.retail.marketplace.orders.entities;

import lombok.Data;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.example.retail.marketplace.orders.commands.CreateOrderCommand;
import org.example.retail.marketplace.orders.commands.OrderCreatedEvent;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Aggregate
public class OrderAggregate {
    @AggregateIdentifier
    private String orderId;
    private double customerId;
    private double shoppingCartId;
    private BigDecimal totalCost;
    private LocalDateTime placedAt;
    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime deliveredAt;
    private OrderStatus orderStatus;

    public OrderAggregate(double customerId, double shoppingCartId, BigDecimal totalCost) {
        this.customerId = customerId;
        this.shoppingCartId = shoppingCartId;
        this.totalCost = totalCost;
        this.orderId = UUID.randomUUID().toString();
        this.placedAt = LocalDateTime.now();
        this.orderStatus = OrderStatus.ORDERED;
        this.estimatedDeliveryDate = estimateDeliveryDate();
    }

    @CommandHandler
    public OrderAggregate(CreateOrderCommand command) {
        AggregateLifecycle.apply(new OrderCreatedEvent(command.getOrderId(), OrderStatus.ORDERED, command.getCustomerId(),
                command.getShoppingCartId(), command.getTotalCost()));
    }

    private LocalDateTime estimateDeliveryDate() {
        return LocalDateTime.now().plusDays(2);
    }

    public void updateOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void updateDeliveryDate(LocalDateTime deliveryDate) {
        this.estimatedDeliveryDate = deliveryDate;
    }

    @EventSourcingHandler
    public void on(OrderCreatedEvent event) {
        this.orderId = event.getOrderId();
    }
}
