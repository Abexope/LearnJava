package com.Abe.jdbc;

import com.Abe.domain.Emp;
import com.Abe.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo8 {

    public static void main(String[] args) {
        List<Emp> list = new JdbcDemo8().findAll2();
        System.out.println(list);
    }

    /**
     *  查询所有 emp 对象
     *  @return List<Emp>
     */
    public List<Emp> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            // 3.定义sql
            String sql = "SELECT * FROM emp";
            // 4.获取执行sql对象
            stmt = conn.createStatement();
            // 5.执行sql
            rs = stmt.executeQuery(sql);
            // 6.遍历结果，封装对象，装载集合
            Emp emp;
            list = new ArrayList<>();
            while (rs.next()) {
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
                rs.getInt("dept_id");

                // 装载数据
                emp = new Emp();
                emp.setId(id);
                emp.setEmp_name(emp_name);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoin_date(join_date);
                emp.setSalary(salary);
                emp.setBonus(bonus);

                // 装载集合
                list.add(emp);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
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
        return list;
    }

    /**
     *  演示JDBC工具类
     *  @return List<Emp>
     */
    public List<Emp> findAll2() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            // 1.注册驱动 2.获取连接
            conn = JDBCUtils.getConnection();
            // 3.定义sql
            String sql = "SELECT * FROM emp";
            // 4.获取执行sql对象
            stmt = conn.createStatement();
            // 5.执行sql
            rs = stmt.executeQuery(sql);
            // 6.遍历结果，封装对象，装载集合
            Emp emp;
            list = new ArrayList<>();
            while (rs.next()) {
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
                rs.getInt("dept_id");

                // 装载数据
                emp = new Emp();
                emp.setId(id);
                emp.setEmp_name(emp_name);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoin_date(join_date);
                emp.setSalary(salary);
                emp.setBonus(bonus);

                // 装载集合
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            JDBCUtils.close(rs, stmt, conn);
        }
        return list;
    }
}
