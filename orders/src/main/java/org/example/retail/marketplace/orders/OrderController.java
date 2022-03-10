package org.example.retail.marketplace.orders;

import lombok.RequiredArgsConstructor;
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
public class OrderController {
    private final CommandGateway commandGateway;
    private final QueryGateway queryGateway;

    @PostMapping("/order")
    public CompletableFuture<Object> createOrder(@RequestBody OrderDTO orderDTO) {
        return commandGateway.send(new CreateOrderCommand(orderDTO.getOrderId(), orderDTO.getCustomerId(), orderDTO.getShoppingCartId(), orderDTO.getTotalCost()));
    }

    @GetMapping("/all-orders")
    public CompletableFuture<List<Order>> getAllOrders() {
        return queryGateway.query(new FindAllOrderedProductsQuery(), ResponseTypes.multipleInstancesOf(Order.class));
    }
}
