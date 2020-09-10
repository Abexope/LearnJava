package com.Abe.jdbctemplate;

import com.Abe.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *  Spring - 初识JDBCTemplate
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        // 1.导入jar包
        // 2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        // 3.调用方法
        String sql = "UPDATE account SET balance = 50000 WHERE id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
