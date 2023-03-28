package com.ezcommerce.bookstore.domain;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author Sravanti Cherukuri
 * @Date 28-03-2023
 */

@Data
public class OrderItem {

  private String product_code;

  private Integer quantity;

  private BigDecimal unit_price;

  private BigDecimal amount;

}
