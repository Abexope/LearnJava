package com.Abe.test04;

public interface TestInterface02 {

    // 常量
    public static final int NUM = 10;

    // 抽象方法
    public abstract void a();

    // default非抽象方法
    public default void b(){
        System.out.println("----TestInterface02.super.b()----");
    }

    // 静态方法
    public static void c() {    // static 不能省略
        System.out.println("----TestInterface02.c()----");
    }

}


class ImpCls02 implements TestInterface02 {

    @Override
    public void a() {
        System.out.println("重写a方法");
    }

    @Override
    public void b() {
        System.out.println("重写b方法");
    }

    public static void c() {
        System.out.println("----Demo.c()----");
    }

}


class test02 {

    public static void main(String[] args) {
        ImpCls02 d = new ImpCls02();
        ImpCls02.c();                   // OK
        d.c();                      // OK，但是没必要
    }

}
