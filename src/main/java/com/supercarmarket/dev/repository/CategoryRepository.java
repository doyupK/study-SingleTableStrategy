package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.Board;
import com.supercarmarket.dev.domain.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
