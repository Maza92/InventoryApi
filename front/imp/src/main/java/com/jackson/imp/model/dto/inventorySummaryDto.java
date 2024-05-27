/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp.model.dto;

import lombok.Data;

/**
 *
 * @author luis
 */
@Data
public class inventorySummaryDto {

  int totalProducts;
  String productsTop;
  Long productoStock;
  inventoryValue InventoryValue;
}
