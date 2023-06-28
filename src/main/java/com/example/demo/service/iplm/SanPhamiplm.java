package com.example.demo.service.iplm;

import com.example.demo.Entity.SanPham;
import com.example.demo.Repo.SanPhamRepo;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SanPhamiplm implements SanPhamService {


    @Autowired
    SanPhamRepo sanPhamRepo;
    @Override
    public void hienthi() {
        sanPhamRepo.findAll();

    }
}
