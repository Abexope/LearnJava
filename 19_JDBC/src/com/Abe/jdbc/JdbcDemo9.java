package com.Abe.jdbc;

import com.Abe.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 *  案例：登陆功能
 *  需求：
 *      1.通过键盘录入用户名和密码
 *      2.判断用户是否登陆成功
 */
public class JdbcDemo9 {

    public static void main(String[] args) {
        // 1.键盘录入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        // 2.调用方法
        boolean flag = new JdbcDemo9().login2(username, password);
        // 3.判断结果，输出不同语句
        if (flag)
            System.out.println("success");
        else
            System.out.println("用户名或密码错误");
    }

    /**
     * 登陆方法
     */
    public boolean login(String username, String password) {
        if (username == null || password == null)
            return false;
        // 连接数据库判断是否登陆成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1.获取数据库连接对象
            conn = JDBCUtils.getConnection();
            // 2.定义sql语句
            String sql = "SELECT * FROM user WHERE username = '"+username+"' AND password = '"+password+"'";    // 危险：SQL注入！
            // 3.获取sql执行对象
            stmt = conn.createStatement();
            // 4.执行查询
            rs = stmt.executeQuery(sql);
            // 5.判断
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }
        return false;
    }

    /**
     * 登陆方法，使用PreparedStatement实现，避免SQL注入
     */
    public boolean login2(String username, String password) {
        if (username == null || password == null)
            return false;
        // 连接数据库判断是否登陆成功
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        try {
            // 1.获取数据库连接对象
            conn = JDBCUtils.getConnection();
            // 2.定义sql语句 - 避免SQL注入！
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";    // 使用?作为sql语句占位符
            // 3.获取sql执行对象
            pStmt = conn.prepareStatement(sql);
            // 给占位符?赋值
            pStmt.setString(1, username);
            pStmt.setString(2,password);
            // 4.执行查询
            rs = pStmt.executeQuery();
            // 5.判断
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pStmt, conn);
        }
        return false;
    }
}
