package com.project.demo.logic.entity.product;

import com.project.demo.logic.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> getProductsById(Long id, Pageable pageable);
}
