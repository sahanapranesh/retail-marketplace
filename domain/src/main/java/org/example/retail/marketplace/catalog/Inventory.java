package org.example.retail.marketplace.catalog;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Inventory {
    private double inventoryId;
    private int quantity;
}
