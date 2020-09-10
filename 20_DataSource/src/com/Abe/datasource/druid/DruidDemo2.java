package com.Abe.datasource.druid;

import com.Abe.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  使用JDBC工具类调用数据库连接池
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        /*完成添加动作，给account表添加一条记录*/
        Connection conn = null;
        PreparedStatement pStmt = null;
        try {
            // 1.获取连接
            conn = JDBCUtils.getConnection();
            // 2.定义sql
            String sql = "INSERT INTO account VALUES(NULL, ?, ?)";
            // 3.获取pStmt对象
            pStmt = conn.prepareStatement(sql);
            // 4.填充sql语句中的?占位符
            pStmt.setString(1,"王五");
            pStmt.setDouble(2,3000);
            // 5.执行sql
            int count = pStmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6.释放资源
            JDBCUtils.close(pStmt, conn);
        }
    }
}
