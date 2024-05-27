/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.imp.model.dto.inventorySummaryDto;
import com.jackson.imp.model.product;
import com.jackson.imp.model.supplier;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author luis
 */
public class NewClass {

  public static void main(String[] args) throws JsonProcessingException, IOException {
    product product = new product();

    product.setName("luis");
    product.setDescription("fawdadwd");
    product.setCategory("catefra");
    product.setPrice(12.2);
    product.setStock(12);

    supplier sup = new supplier(1L, "Devpulse", "rbellino0@jigsy.com");

    product.setSupplier(sup);

    System.out.println(LocalDateTime.now());
      
    

    Request rq = new Request();
    JsonParsing jp = new JsonParsing();
    
      System.out.println(jp.parse(product));
    

  }
}
