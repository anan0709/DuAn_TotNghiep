/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demojavaswing.utils;

import com.demojavaswing.entity.DienGiamPhi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class JdbcUtil {

    static String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyTrungTamTinHoc;encrypt=true;trustServerCertificate=true";
    static String user = "sa";
    static String pass = "123";

    static {
        try {
            Class.forName(Driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement preparedStatement(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = conn.prepareCall(sql); //proc
        } else {
            pstmt = conn.prepareStatement(sql); //SQL
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement pstmt = preparedStatement(sql, args);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement pstmt = preparedStatement(sql, args);
            try {
                pstmt.executeUpdate();
            } finally {
                pstmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
