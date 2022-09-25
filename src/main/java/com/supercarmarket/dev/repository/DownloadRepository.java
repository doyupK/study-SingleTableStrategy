package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.download.Download;
import com.supercarmarket.dev.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadRepository extends JpaRepository<Download, Long> {
}
