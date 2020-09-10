package com.Abe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  account 修改记录
 */
public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            // 3.定义sql
            String sql = "UPDATE account SET balance = 1500 WHERE id = 3";
            // 4.获取执行对象
            stmt = conn.createStatement();
            // 5.执行sql
            int count = stmt.executeUpdate(sql);
            // 6.处理结果
            System.out.println(count);
            if (count > 0)
                System.out.println("success");
            else
                System.out.println("failure");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
