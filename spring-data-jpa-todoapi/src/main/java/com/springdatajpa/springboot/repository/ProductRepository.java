package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Srishti
 * @created 2/3/2023: 9:10 PM
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
