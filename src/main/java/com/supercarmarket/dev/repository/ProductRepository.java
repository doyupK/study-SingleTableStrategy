package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.product.Product;
import com.supercarmarket.dev.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
