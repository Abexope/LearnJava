package com.Abe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *  JDBC快速入门
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        // 1.导入驱动jar包
        // 2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 3.获取数据库连接对象
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/db3", "root", "root");
        // 4.定义sql语句
        String sql = "UPDATE account SET balance = 500 WHERE id = 1";
        // 5.获取sql对象
        Statement stmt = conn.createStatement();
        // 6.执行sql语句
        int count = stmt.executeUpdate(sql);
        // 7.处理结果
        System.out.println(count);
        // 8.释放资源
        stmt.close();
        conn.close();
    }
}
