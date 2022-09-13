package com.qa.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
