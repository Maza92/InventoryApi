package com.example.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "product", uniqueConstraints = {
  @UniqueConstraint(columnNames = { "product_name"} ),
})
public class product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id", nullable = false)
  private Long id;

  @Column(name = "product_name", nullable = false, length = 100)
  private String name; 

  @Column(name = "description", nullable = false, length = 200)
  private String description;

  @Column(name = "category", nullable = false)
  private String category;

  @Column(name = "price", nullable = false)
  private Double price;
  
  @Column(name = "stock", nullable = false)
  private Integer stock;

  @ManyToOne
  @JoinColumn(name = "supplier_id")
  private supplier supplier;
}



