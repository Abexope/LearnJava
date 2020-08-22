package com.Abe.Junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *  单元测试类
 */

public class CalculatorTest {

    /*
        初始化方法
        用于资源申请，所有测试方法在执行前都会先执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /*
        资源释放方法
        在所有测试方法执行完后，都会自动执行该方法，无论测试方法是否出现异常
     */
    @After
    public void close() {
        System.out.println("close...");
    }

    /*
        测试 add 方法
     */
    @Test
    public void testAdd() {
        // 1.创建 Calculator 对象
        Calculator c = new Calculator();
        // 2.调用 add 方法
        int result = c.add(1, 2);
        System.out.println("testSub...");
        Assert.assertEquals(3, result);
    }
}
