package com.example.db.controller;

import com.example.db.model.supplier;
import com.example.db.service.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class supplierController {

    supplierService service;

    @Autowired
    public supplierController(supplierService service) {
        this.service = service;
    }

    @GetMapping("/api/supplier")
    public List<supplier> getAllProducts() {
        return service.getSuppliers();
    }
}
