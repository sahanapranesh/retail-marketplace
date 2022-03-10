package org.example.retail.marketplace.orders.query;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.example.retail.marketplace.orders.commands.OrderCreatedEvent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrdersEventHandler {
    private final Map<String, Order> orders = new HashMap<>();

    @EventHandler
    public void on(OrderCreatedEvent orderCreatedEvent) {
        orders.put(orderCreatedEvent.getOrderId(), new Order(orderCreatedEvent.getOrderId(),
                orderCreatedEvent.getCustomerId(),
                orderCreatedEvent.getShoppingCartId(),
                orderCreatedEvent.getTotalCost(), orderCreatedEvent.getPlacedAt()
                ,orderCreatedEvent.getEstimatedDeliveryDate(),
                orderCreatedEvent.getOrderStatus()));
    }

    @QueryHandler
    public List<Order> handle(FindAllOrderedProductsQuery query) {
        return new ArrayList<>(orders.values());
    }

}
