package com.Abe.test06;

/**
 * 代码块
 */


public class Test {

    // 属性
    int a;
    static int sa;

    // 方法

    public void a() {
        System.out.println("    ----a");
        {
            // 这是一个普通块
            System.out.println("    00000这是一个普通块");
            int num = 10;
            System.out.println("    " + num);
        }
//        System.out.println(num);    // 异常，普通块限制了局部变量的作用范围
    }

    public static void b() {
        System.out.println("----b----static这是一个静态方法");
    }

    // 构造块
    {
        System.out.println("----c----construct这是一个构造块");       // 在方法外写代码，平时不常用
        ;
    }

    // 静态块
    static {    // 较为常用，例如：加载工厂，数据库的初始信息等
        System.out.println("----d----staticblock 这是一个静态块");
        System.out.println("Test.sa：" + Test.sa);
        b();
        Test.b();       // 静态块中只能访问 `静态属性` 和 `静态方法`
        ;
    }

    // 构造器
    public Test() {}

    public Test(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        Test.sa = 200;

        Test t = new Test();
        t.a();

        System.out.println();
        Test t2 = new Test(100);
        t2.a();

        System.out.println();

        Test t3 = new Test(100);
        t3.a();

        System.out.println();
        System.out.println(Test.sa);
        Test.b();

        System.out.println();
        com.Abe.test05.Demo p = new com.Abe.test05.Demo();      // 实例化其它包中的对象

    }
}
