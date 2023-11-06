/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.entity;

/**
 *
 * @author Nhu Y
 */
public class SanPham {
    private String MaSanPham;
    private String TenSanPham;
    private String Hinh;
    private String Loai;
    private String GiaNhap;
    private String GiaXuat;
    private String SoLuong;
    public SanPham() {
        
}
    public SanPham(String MaSanPham, String TenSanPham, String Hinh, String Loai, String GiaNhap, String GiaXuat, String SoLuong) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.Hinh = Hinh;
        this.Loai = Loai;
        this.GiaNhap = GiaNhap;
        this.GiaXuat = GiaXuat;
        this.SoLuong = SoLuong;
       
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(String GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public String getGiaXuat() {
        return GiaXuat;
    }

    public void setGiaXuat(String GiaXuat) {
        this.GiaXuat = GiaXuat;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

}
