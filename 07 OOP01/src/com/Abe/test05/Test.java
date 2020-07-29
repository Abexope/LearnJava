package com.Abe.test05;

/**
 * 静态修饰符：static
 */

public class Test {
    //属性：
    int id;
    static int sid;
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //创建一个Test类的具体的对象
        Test t1 = new Test();
        t1.id = 10;
        t1.sid = 10;
        Test t2 = new Test();
        t2.id = 20;
        t2.sid = 20;
        Test t3 = new Test();
        t3.id = 30;
        t3.sid = 30;
        //读取属性的值：
        System.out.println(t1.id);
        System.out.println(t2.id);
        System.out.println(t3.id);
        System.out.println(t1.sid);
        System.out.println(t2.sid);
        System.out.println(t3.sid);
    }
}
