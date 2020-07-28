package com.Abe.test01;


public final class Person {     // 禁止继承，断子绝孙类
    public final void eat() {       // 禁止子类重写该方法
        System.out.println("吃饭");
    }
}