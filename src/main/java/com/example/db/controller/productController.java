package com.example.db.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.db.model.product;
import com.example.db.service.productService;

@RestController
public class productController {
  
  @Autowired
  productService productService;

  @GetMapping("/api/product")
  public List<product> getProducts() {
    return productService.getAll();
  }

  @PostMapping("/api/product")
  public ResponseEntity<product> saveProduct(@RequestBody product product) {
    if (productService.setProduct(product) == null) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @GetMapping("/api/product/{id}")
  public Optional<product> searchById(@PathVariable Long id) {
    return productService.getById(id);
  }

  @DeleteMapping("/api/product/{id}")
  public void deleteByid(@PathVariable Long id) {
    productService.deleteById(id);
  }
}




