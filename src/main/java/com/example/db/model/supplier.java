package com.example.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class supplier {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "supplier_id", nullable = false)
  private Long id;

  @Column(name = "company_name", nullable = false, length = 100)
  private String name;
  
  @Column(name = "contact", nullable = false, length = 100)
  private String contact;
}
