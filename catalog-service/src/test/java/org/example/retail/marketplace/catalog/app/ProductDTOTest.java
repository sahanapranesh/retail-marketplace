package org.example.retail.marketplace.catalog.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.math.BigDecimal;

public class ProductDTOTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() throws JsonProcessingException {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("Chocolate");
        productDTO.setDescription("Eatable");
        productDTO.setCost(new BigDecimal(10));
        System.out.println(objectMapper.writeValueAsString(productDTO));
    }
}