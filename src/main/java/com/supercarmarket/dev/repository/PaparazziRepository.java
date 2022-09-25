package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.paparazzi.Paparazzi;
import com.supercarmarket.dev.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaparazziRepository extends JpaRepository<Paparazzi, Long> {
}
