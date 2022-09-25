package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.Board;
import com.supercarmarket.dev.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
