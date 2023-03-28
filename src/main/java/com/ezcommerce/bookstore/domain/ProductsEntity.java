package com.ezcommerce.bookstore.domain;

import java.math.BigDecimal;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sravanti Cherukuri
 * @Date 28-03-2023
 */

@Data
@Document("products")
public class ProductsEntity {

  @Id
  private String id;

  private String code;

  private String description;

  private String author;

  private BigDecimal price;

  private String genre;

  private Long isbn;

  private Integer stock;

  private String status;

  private String image_path;



}
