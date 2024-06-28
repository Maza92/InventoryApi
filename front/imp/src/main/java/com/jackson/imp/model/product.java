/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 *
 * @author luis
 */
@Data
public class product {
  
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private Long id;
  private String name;
  private String description;
  private String category;
  private Double price;
  private Integer stock;
  private supplier supplier;
  public product() {
  }

  public product(Long id, String name, String description, String category, Double price, Integer stock, supplier supplier) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.category = category;
    this.price = price;
    this.stock = stock;
    this.supplier = supplier;
  }
  
  @Override
  public String toString() {
    return "Product:\n" + "id: " + getId() 
            + "\nname: " + getName() 
            + "\ndescription: " + getDescription()
            + "\ncategory: " + getCategory()
            + "\nprice: " + getPrice()
            + "\nstock: " + getStock()
            + "\nsupplier: " 
            + "   \nid: " + getSupplier().getId()
            + "   \nname: " + getSupplier().getName()
            + "   \ncontact: " + getSupplier().getContact() + "\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
  }
}
