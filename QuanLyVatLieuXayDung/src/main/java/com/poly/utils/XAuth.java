/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demojavaswing.utils;

import com.demojavaswing.entity.HocVien;
import com.demojavaswing.entity.TaiKhoanCB;

/**
 *
 * @author Admin
 */
public class XAuth {
    /*
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static TaiKhoanCB user = null;

    /*
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        XAuth.user = null;
    }
/*
     * Kiểm tra xem đã đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return XAuth.user != null;
    }

    /*
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
    public static boolean isManager() {
        return XAuth.isLogin() && user.isVaiTro();
    }
}
