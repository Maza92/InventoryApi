package com.example.db.model.dto;

import lombok.Data;

@Data
public class inventorySummaryDto {
  int totalProducts; 
  String productsTop;
  Long productoStock;
  double totalInventoryValue;

  public inventorySummaryDto(int totalProducts, String productsTop, Long productoStock, double totalInventoryValue) {
    this.totalProducts = totalProducts;
    this.productsTop = productsTop;
    this.productoStock = productoStock;
    this.totalInventoryValue = totalInventoryValue;
  }
}
