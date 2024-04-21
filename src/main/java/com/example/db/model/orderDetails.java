package com.example.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class orderDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "orderDetails_id", nullable = false)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "order_id", nullable = false)
  private order order;

  @ManyToOne
  @JoinColumn(name = "product_id", nullable = false)
  private product product;

  @Column(name = "unit_price", nullable = false)
  private double price;

  @Column(name = "quantity", nullable = false)
  private int quantity;
}

