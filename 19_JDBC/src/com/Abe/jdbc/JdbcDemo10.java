package com.Abe.jdbc;

import com.Abe.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  使用JDBC操作数据库事务
 */
public class JdbcDemo10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pStmt1 = null, pStmt2 = null;

        try {
            // 1.获取数据库连接
            conn = JDBCUtils.getConnection();

            // 开启事务
            conn.setAutoCommit(false);

            // 2.定义sql
            // 2.1 转账sql
            String sql1 = "UPDATE account SET balance = balance - ? WHERE id = ?";
            // 2.2 收款sql
            String sql2 = "UPDATE account SET balance = balance + ? WHERE id = ?";
            // 3.获取sql执行对象
            pStmt1 = conn.prepareStatement(sql1);
            pStmt2 = conn.prepareStatement(sql2);
            // 4.设置参数
            // 4.1 转账占位符
            pStmt1.setDouble(1, 500);
            pStmt1.setInt(2, 1);
            // 4.2 收款占位符
            pStmt2.setDouble(1, 500);
            pStmt2.setInt(2, 2);
            // 5.执行sql
            pStmt1.executeUpdate();
            // 手动制造异常
//            int i = 3 / 0;
            pStmt2.executeUpdate();

            // 提交事务
            conn.commit();

        } catch (Exception e) {
            // 事务回滚
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("事务回滚");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pStmt1, conn);
            JDBCUtils.close(pStmt2, null);
        }
    }
}
