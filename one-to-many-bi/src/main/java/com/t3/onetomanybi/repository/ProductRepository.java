package com.t3.onetomanybi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.onetomanybi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
