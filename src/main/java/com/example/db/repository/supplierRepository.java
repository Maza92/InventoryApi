package com.example.db.repository;

import com.example.db.model.supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface supplierRepository extends JpaRepository<supplier, Long> { }
