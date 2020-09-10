package com.Abe.jdbctemplate;

import com.Abe.domain.Emp;
import com.Abe.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *  JDBCTemplate CRUD 练习
 */
public class JdbcTemplateDemo2 {
    // Junit单元测试，让方法独立执行
    // 1.获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 1. 修改1号数据的 salary 为 10000
     */
    @Test
    public void test1() {
        // 2.定义sql
        String sql = "UPDATE emp SET salary = 10000 WHERE id = ?";
        // 3.执行sql
        int count = template.update(sql, 1001);
        System.out.println(count);
    }

    /**
     * 2. 添加一条记录
     */
    @Test
    public void test2() {
        String sql = "INSERT INTO emp(id, ename, dept_id) VALUES (?, ?, ?)";
        template.update(sql, 1015, "郭靖", 10);
    }

    /**
     * 3.删除刚才添加的记录
     */
    @Test
    public void test3() {
        String sql = "DELETE FROM emp WHERE id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    /**
     * 4.查询id为1001的记录，将其封装为Map集合
     * 注意：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4() {
        String sql = "SELECT * FROM emp WHERE id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
        // 字段名为key，字段值为value
        // {id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}
    }

    /**
     * 5. 查询所有记录，将其封装为List
     */
    @Test
    public void test5() {
        String sql = "SELECT * FROM emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        System.out.println(list);
    }

    /**
     * 6. 查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6() {
        String sql = "SELECT * FROM emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();

                // 获取数据
                int id = rs.getInt("id");
                String emp_name = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date join_date = rs.getDate("joindate");
                /*  注意
                    rs.getDate()返回的是java.sql.Date对象
                    我们使用的对象是java.util.Date引用承接
                    util.Date是sql.Date的父类，所以这里是一个多态
                 */
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                // 装载数据
                emp = new Emp();
                emp.setId(id);
                emp.setEmp_name(emp_name);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoin_date(join_date);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });
        System.out.println(list);
    }

    /**
     * 6*. 查询所有记录，将其封装为Emp对象的List集合(Spring提供的简化写法，反射)
     */
    @Test
    public void test7() {
        String sql = "SELECT * FROM emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        System.out.println(list);
    }

    /**
     * 7. 查询总记录数
     */
    @Test
    public void test8() {
        String sql = "SELECT COUNT(id) FROM emp";
        Long total = template.queryForObject(sql, Long.class);
        Integer intTotal = template.queryForObject(sql, Integer.class);
        System.out.println(total + " " + intTotal);
    }
}
