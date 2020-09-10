package com.Abe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  account表 添加一条记录 insert 语句
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.定义sql
            String sql = "INSERT INTO account VALUES(NULL, '王五', 3000)";    // sql语句
            // 3.获取connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            /*当连接本地数据库且使用默认端口时，可以不写url和端口号*/
            // 4.获取执行的sql对象 Statement
            stmt = conn.createStatement();
            // 5.执行sql
            int count = stmt.executeUpdate(sql);    // 影响的行数, 1
            // 6.处理结果
            System.out.println(count);
            if (count > 0)
                System.out.println("添加成功");
            else
                System.out.println("添加失败");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            if (stmt != null) {     // 避免空指针异常
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {     // 避免空指针异常
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
