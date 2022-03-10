package org.example.retail.marketplace.orders.app;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.example.retail.marketplace.orders.commands.CreateOrderCommand;
import org.example.retail.marketplace.orders.query.FindAllOrderedProductsQuery;
import org.example.retail.marketplace.orders.query.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final CommandGateway commandGateway;
    private final QueryGateway queryGateway;

    @PostMapping("/order")
    public CompletableFuture<Object> createOrder(@RequestBody OrderDTO orderDTO) {
        log.info("Received request to create an order for customerId={}", orderDTO.getCustomerId());
        return commandGateway.send(new CreateOrderCommand(orderDTO.getOrderId(), orderDTO.getCustomerId(), orderDTO.getShoppingCartId(), orderDTO.getTotalCost()));
    }

    @GetMapping("/orders")
    public CompletableFuture<List<Order>> getAllOrders() {
        log.info("Received request to fetch all orders");
        return queryGateway.query(new FindAllOrderedProductsQuery(), ResponseTypes.multipleInstancesOf(Order.class));
    }
}
