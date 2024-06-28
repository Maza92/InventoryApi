package com.example.db.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne; import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "order_Summary")
public class order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id", nullable = false)
  private Long id;
  
  @Column(name = "order_date", nullable = false)
  LocalDateTime date;

  @ManyToOne
  @JoinColumn(name = "customer_id", nullable = false)
  private customer customer;
}
