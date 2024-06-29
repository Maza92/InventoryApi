package com.example.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.model.dto.inventorySummaryDto;
import com.example.db.service.summaryService;

@RestController
public class summaryController {
  
  @Autowired
  summaryService summaryService;

  @GetMapping("/api/summary")
  public inventorySummaryDto getMainSummary() {
    return summaryService.getMainSummary();
  }
}
