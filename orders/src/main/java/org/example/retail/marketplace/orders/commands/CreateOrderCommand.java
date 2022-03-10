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
    private final double customerId;
    private final double shoppingCartId;
    private final BigDecimal totalCost;

}
