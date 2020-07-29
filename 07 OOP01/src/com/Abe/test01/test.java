package com.Abe.test01;

/**
 * 创建对象：类的实例化
 */


public class test {
    // 这是一个main方法，是程序的入口
    public static void main(String[] args) {
        // 创建一个人类的具体的对象/实例
        Person person = new Person();       // Person是一个`引用数据类型`
        // 第一次实例化对象的时候，会进行类的加载，实例化对象时，没有初值的对象属性将被赋予默认初值(0，0.0，null)
        person.age = 19;
        person.name = "ZhangSan";
        person.height = 180.4;
        person.weight = 170.2;

        // 再创建一个对象
        // 再次创建对象时，就不会进行类的加载了，类的加载只在第一次需要的时候加载一次
        Person person1 = new Person();
        person.name = "LiSi";
        person.age = 18;
        person.height = 170.6;
        person.weight = 160.5;

        // 访问属性：对象之间的属性是独立的
        System.out.println(person.name);
        System.out.println(person1.age);

        // 执行方法：同类对象的方法是共享的
        person.eat();
        person1.eat();
        System.out.println(person.introduce());
        System.out.println(person1.introduce());

    }
}
