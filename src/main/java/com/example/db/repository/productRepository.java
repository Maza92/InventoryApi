package com.example.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.db.model.product;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface productRepository extends JpaRepository<product, Long> {

  @Query(value = "SELECT TOP 1 p.product_name FROM product p " + 
                  "INNER JOIN order_details od ON p.product_id = od.product_id " +
                  "GROUP BY p.product_name " +
                  "ORDER BY SUM(od.quantity) DESC;", nativeQuery = true)
  String findToSellingProduct();
}
