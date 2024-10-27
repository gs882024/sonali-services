package com.sonali.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonali.app.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, String> {

}
