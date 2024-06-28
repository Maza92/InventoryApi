package com.example.db.model.dto;

import lombok.Data;

@Data
public class inventorySummaryDto {
  int totalProducts; 
  String productsTop;
  Long productoStock;
  inventoryValue InventoryValue;

  public inventorySummaryDto(int totalProducts, String productsTop, Long productoStock, inventoryValue InventoryValue) {
    this.totalProducts = totalProducts;
    this.productsTop = productsTop;
    this.productoStock = productoStock;
    this.InventoryValue = InventoryValue;
  }
}
