package com.example.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.db.model.dto.inventorySummaryDto;
import com.example.db.repository.productRepository;

@Service
public class summaryService {

  @Autowired
  productRepository productRepository;

  public inventorySummaryDto getMainSummary() {
    return new inventorySummaryDto(
      productRepository.findAll()
                      .stream()
                      .mapToInt(product -> product.getStock())
                      .sum(),

      productRepository.findToSellingProduct(),

      productRepository.findAll()
                      .stream()
                      .filter(product -> product.getStock() < 20)
                      .count(), 

      productRepository.findAll()
                      .stream()
                      .mapToDouble(product -> product.getPrice() * product.getStock())
                      .sum()
    );
  }
}
