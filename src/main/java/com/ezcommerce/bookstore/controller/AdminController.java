package com.ezcommerce.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sravanti Cherukuri
 * @Date 28-03-2023
 */

@RestController
@RequestMapping("/admin")
public class AdminController {

  @GetMapping("/productslist")
  public String getProducts(){

    return "Book1";
  }

}
