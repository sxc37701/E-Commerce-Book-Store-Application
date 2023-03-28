package com.ezcommerce.bookstore.domain;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sravanti Cherukuri
 * @Date 28-03-2023
 */

@Data
@Document("users")
public class UsersEntity {

  @Id
  private String id;

  private String first_name;

  private String last_name;

  private String email_id;

  private Integer phone_number;

  private String user_id;

  private String user_role;

  private List<Address> address_list;

  private List<Payment> payment_details;

}
