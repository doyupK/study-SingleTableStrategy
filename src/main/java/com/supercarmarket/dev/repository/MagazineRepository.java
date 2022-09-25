package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.magazine.Magazine;
import com.supercarmarket.dev.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagazineRepository extends JpaRepository<Magazine, Long> {
}
