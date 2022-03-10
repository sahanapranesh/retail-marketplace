package org.example.retail.marketplace.orders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.retail.marketplace.orders.app.OrderDTO;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class OrderDTOTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void name() throws JsonProcessingException {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("Order1");
        orderDTO.setCustomerId("Cust1");
        orderDTO.setShoppingCartId("8");
        orderDTO.setTotalCost(new BigDecimal(67.0));
        System.out.println(objectMapper.writeValueAsString(orderDTO));
    }
}