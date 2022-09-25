package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.Board;
import com.supercarmarket.dev.domain.product.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductModelRepository extends JpaRepository<ProductModel, Long> {
}
