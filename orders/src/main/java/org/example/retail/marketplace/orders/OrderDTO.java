package org.example.retail.marketplace.orders;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDTO {
    private String orderId;
    private double customerId;
    private double shoppingCartId;
    private BigDecimal totalCost;

}
