package org.example.retail.marketplace.orders.app;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDTO {
    private String orderId;
    private String customerId;
    private String shoppingCartId;
    private BigDecimal totalCost;

}
