/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 *
 * @author luis
 */

@Data
public class supplier {
  
  private Long id;  
  private String name;  
  private String contact;
  public supplier() {
  }

  public supplier(Long id, String name, String contact) {
    this.id = id;
    this.name = name;
    this.contact = contact;
  }
}
