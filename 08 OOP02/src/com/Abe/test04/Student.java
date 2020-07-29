package com.Abe.test04;


public class Student extends Person {

    public void eat(int num) {       // 一旦修改了形参列表，JVM自动将该方法识别为类内独有方法，而不是重写方法
        System.out.println(num + "吃肉");
    }

    public void study() {
        System.out.println("学习");
    }

}
