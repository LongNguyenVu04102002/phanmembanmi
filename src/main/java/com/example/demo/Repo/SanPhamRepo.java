package com.example.demo.Repo;

import com.example.demo.Entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanPhamRepo extends JpaRepository<SanPham,String> {
}
