package com.Abe.Annotation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 *  简单的测试框架
 *
 *  当主方法执行后，会自动检测所有的方法（加了Check注解的方法），判断方法是否有异常，记录到文件中
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        // 1.创建计算器对象
        Calculator c = new Calculator();
        // 2.获取字节码对象
        Class<? extends Calculator> cls = c.getClass();
        // 3.获取所有方法
        Method[] methods = cls.getMethods();


        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            // 4.判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)) {
                // 5.有就执行，没有不执行
                try {
                    method.invoke(c);
                } catch (Exception e) {       // 6.捕获异常
                    // 记录文件信息
                    number++;
                    bw.write(method.getName() + "方法出现异常");
                    bw.newLine();
                    bw.write("异常名称: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------------------------------");
                    bw.newLine();
                }
            }
        }

        bw.write("本次测试一共出现 " + number + " 次异常");
        bw.flush();
        bw.close();



    }
}
