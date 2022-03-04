package org.example.retail.marketplace.customer;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class PaymentMode {
    private int paymentModeId;
    private String type;
    private BigDecimal accountNumber;
}
