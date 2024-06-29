package com.example.db.service;

import com.example.db.model.supplier;
import com.example.db.repository.supplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class supplierService {

    supplierRepository repository;

    @Autowired
    public supplierService(supplierRepository repository) {
        this.repository = repository;
    }

    public List<supplier> getSuppliers() {
        return repository.findAll();
    }
}
