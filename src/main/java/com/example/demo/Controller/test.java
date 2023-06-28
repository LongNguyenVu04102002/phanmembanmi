package com.example.demo.Controller;


import com.example.demo.Entity.SanPham;
import com.example.demo.Repo.SanPhamRepo;
import com.example.demo.service.iplm.SanPhamiplm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class test {


    @Autowired
    SanPhamiplm sanPhamiplm;

    @Autowired
    SanPhamRepo sanPhamRepo;

    @RequestMapping("/")
    public String hienthi(Model model){
        model.addAttribute("hienthi",new SanPham());
        model.addAttribute("items",sanPhamRepo.findAll());
        return "sanpham/main";
    }
}
