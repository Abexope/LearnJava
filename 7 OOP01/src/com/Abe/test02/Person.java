package com.Abe.test02;

/**
 * 构造器 Constructor
 */


class Person {

    String name;
    int age;
    double height;

    public Person(){}       // 空构造器

    public Person(String name, int age, double height) {
        // 构造器方法的重载
        this.name = name;     // 使用this指针，解决`属性名`和`形参名`重名时产生的歧义问题
        this.age = age;
        this.height = height;
    }

    public void eat(){
        // 吃方法
        System.out.println(this.name + "在吃饭");
    }

}
