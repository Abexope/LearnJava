package com.Abe.test01;

/**
 * 创建类：人类
 */


public class Person {

    // 属性[名词]
    int age;            // 年龄，成员变量
    String name;        // 姓名
    double height;      // 身高
    double weight;      // 体重

    // 方法[动词]
    public void eat() {
        // 吃饭
        int num = 10;   // 局部变量
        System.out.println("吃饭");
    }

    public void sleep(String address) {
        // 睡觉
        System.out.println("在" + address + "睡觉");
    }

    public String introduce() {
        // 自我介绍
        return "我的名字是：" + name + "，我的年龄是：" + age + "我的身高是：" + height + "我的体重是：" + weight;
    }

}
