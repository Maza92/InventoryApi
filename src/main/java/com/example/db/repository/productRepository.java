package com.example.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.db.model.product;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface productRepository extends JpaRepository<product, Long> {

  @Query(value = "SELECT product.product_name FROM product " +
                  "INNER JOIN order_details ON product.product_id = order_details.product_id " +
                  "GROUP BY product.product_name " +
                  "ORDER BY SUM(order_details.quantity) DESC LIMIT 1;", nativeQuery = true)
  String findToSellingProduct();
}
