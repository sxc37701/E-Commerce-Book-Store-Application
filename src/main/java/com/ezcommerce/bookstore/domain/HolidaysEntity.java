package com.ezcommerce.bookstore.domain;

import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sravanti Cherukuri
 * @Date 28-03-2023
 */

@Data
@Document("holidays")
public class HolidaysEntity {

  @Id
  private String id;

  private String holiday_code;

  private String holiday_name;

  private Date holiday_date;
  
}
