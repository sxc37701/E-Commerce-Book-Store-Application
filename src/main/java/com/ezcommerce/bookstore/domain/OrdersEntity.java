package com.ezcommerce.bookstore.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sravanti Cherukuri
 * @Date 28-03-2023
 */

@Data
@Document("orders")
public class OrdersEntity {

  @Id
  private String id;

  private String order_number;

  private String user_id;

  private String delivery_mode;

  private Date delivery_date;

  private String delivery_time_period;

  private String delivery_instructions;

  private String order_status;

  private String payment_mode;

  private BigDecimal total_price;

  private List<OrderItem> items;

}
