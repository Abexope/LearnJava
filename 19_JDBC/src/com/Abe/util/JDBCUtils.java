package com.Abe.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 *  JDBC工具类
 */
public class JDBCUtils {

    private static String url;
    private static String user;
    private static String password;

    /*
        文件读取只需一次，利用静态块实现
     */
    static {
        // 读取资源文件
        try {
            // 1.创建Properties集合类
            Properties properties = new Properties();
            // 获取src路径下文件的方式
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL jdbcPro = classLoader.getResource("jdbc.properties");
            assert jdbcPro != null;
            String path = jdbcPro.getPath();    // 反射结果路径异常`19 JDBC`解析成`19%20JDBC`，`空格`解析异常
            // 2.加载文件
            properties.load(new FileReader(path));
            // 3.获取属性
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            String driver = properties.getProperty("driver");
            // 4.注册驱动
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     * @return 数据库连接对象
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源
     * @param stmt sql执行对象
     * @param conn 数据库连接对象
     */
    public static void close(Statement stmt, Connection conn) {
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

    /**
     * 释放资源
     * @param rs 查询结果对象
     * @param stmt sql执行对象
     * @param conn 数据库连接对象
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
