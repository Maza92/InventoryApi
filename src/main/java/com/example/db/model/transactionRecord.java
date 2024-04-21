package com.example.db.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "[transaction]")
public class transactionRecord {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "transaction_id", nullable = false)
  private Long id; 

  @Column(name = "entry_date", nullable = false)
  private Date entryDate;

  @Column(name = "transaction_type", nullable = false, length = 100)
  private String transactionType;

  @Column(name = "amount", nullable = false)
  private Double amount;

  @Column(name = "details", nullable = true, length = 200)
  private String details;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private product product;
}
