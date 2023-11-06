/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.bean;

import javax.swing.JButton;

/**
 *
 * @author Nhu Y
 */
public class MenuBean {
    private String kind;
    private JButton btn;

    public MenuBean() {
    }

    public MenuBean(String kind, JButton btn) {
        this.kind = kind;
        this.btn = btn;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JButton getbtn() {
        return btn;
    }

    public void setbtn(JButton mnu) {
        this.btn = btn;
    }
    
}
