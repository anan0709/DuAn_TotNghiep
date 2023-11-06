/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.entity;

/**
 *
 * @author Nhu Y
 */
public class LoaiSanPham {
    private int MaLoaiSanPham;
    private String TenLoaiSanPham;
    public LoaiSanPham (){
    
}

    public LoaiSanPham(int MaLoaiSanPham, String TenLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
        this.TenLoaiSanPham = TenLoaiSanPham;
    }

    public int getMaLoaiSanPham() {
        return MaLoaiSanPham;
    }

    public void setMaLoaiSanPham(int MaLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
    }

    public String getTenLoaiSanPham() {
        return TenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String TenLoaiSanPham) {
        this.TenLoaiSanPham = TenLoaiSanPham;
    }
    
}
