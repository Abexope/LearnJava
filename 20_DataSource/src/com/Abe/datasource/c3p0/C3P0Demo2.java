package com.Abe.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *  C3P0配置参数演示
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        // 1.获取DataSource对象
        ComboPooledDataSource ds = new ComboPooledDataSource();
        // 2.获取连接
        for (int i = 0; i < 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(conn);
            if (i == 5)
                conn.close();
        }
        testNamedConfig();
    }

    public static void testNamedConfig() throws SQLException {
        System.out.println("\ntestNamedConfig\n");
        // 1.获取DataSource对象
        ComboPooledDataSource ds = new ComboPooledDataSource("otherc3p0");
        // 2.获取连接
        for (int i = 0; i < 9; i++) {
            Connection conn = ds.getConnection();
            System.out.println(conn);
            if (i == 5)
                conn.close();
        }
    }
}
