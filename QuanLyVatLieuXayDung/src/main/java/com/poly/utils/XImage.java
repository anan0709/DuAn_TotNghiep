/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Nhu Y
 */
public class XImage {
     public static Image getAppIcon() {
        String file = "/com/demojavaswimg/icons/fpt.png";
        return new ImageIcon(XValidate.class.getResource(file)).getImage();
    }

    /*
     * Sao chép file ảnh chuyên đề vào thư mục logos
     */
    public static void saveIconCD(File src) {
        File file = new File("logos", src.getName());
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(file.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /*
     * Đọc hình ảnh logo chuyên đề
     */
    public static ImageIcon readIconCD(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(210, 210, Image.SCALE_DEFAULT));
    }
    
    /*
     * Sao chép file ảnh chuyên đề vào thư mục logos
     */
    public static void saveIconNH(File src) {
        File dst = new File("logos/avatars", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /*
     * Đọc hình ảnh logo chuyên đề
     */
    public static ImageIcon readIconNH(String fileName) {
        File path = new File("logos/avatars", fileName);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(210, 210, Image.SCALE_DEFAULT));
    }
}
