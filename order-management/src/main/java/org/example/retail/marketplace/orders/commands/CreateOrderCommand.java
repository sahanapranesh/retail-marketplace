package org.example.retail.marketplace.orders.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class CreateOrderCommand {
    @TargetAggregateIdentifier
    private final String orderId;
    private final String customerId;
    private final String shoppingCartId;
    private final BigDecimal totalCost;

}
