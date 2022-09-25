package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.product.ProductBrand;
import com.supercarmarket.dev.domain.product.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductBrandRepository extends JpaRepository<ProductBrand, Long> {
}
