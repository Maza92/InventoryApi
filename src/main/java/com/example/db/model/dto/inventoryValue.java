package com.example.db.model.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class inventoryValue {
  double totalInventoryValue;
  LocalDateTime date;

  public inventoryValue(double totalInventoryValue, LocalDateTime date) {
    this.totalInventoryValue = totalInventoryValue;
    this.date = date;
  }

}
