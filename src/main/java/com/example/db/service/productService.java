package com.example.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.db.model.product;
import com.example.db.repository.productRepository;

@Service
public class productService {

  @Autowired
  productRepository repository;

  public List<product> getAll() {
    return repository.findAll();
  }

  public product setProduct(product product) {
    if (repository.save(product) != null) 
      return product;
    
    return null;
  }
}
