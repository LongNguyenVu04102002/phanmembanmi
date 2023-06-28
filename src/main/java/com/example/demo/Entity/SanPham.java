package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sanpham")
public class SanPham {
@Id
@Column(name="id")
@GeneratedValue(strategy = GenerationType.AUTO)
     private UUID id;
@Column(name = "Ma")
    private String ma;
    private String ten;
    private float giaban;
    private int trangthai;

}
