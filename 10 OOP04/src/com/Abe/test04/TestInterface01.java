package com.Abe.test04;

/**
 * JDK1.8后，接口的新增特性
 *      1.public default修饰的非抽象方法
 *              注意：（1）定义此种方法时，default修饰符不能省略。
 *                   （2）若重写接口中的非抽象方法，default修饰符必须省略。
 *      2.静态方法
 *              注意：（1）定义此类方法时，static关键字不能省略。
 *                   （2）不能重写静态方法
 */


public interface TestInterface01 {

    // 常量
    public static final int NUM = 10;

    // 抽象方法
    public abstract void a();
    public default void b(){        // default修饰符不能被省略
        System.out.println("----TestInterface.super.b()----");
    }

}


class ImpCls01 implements TestInterface01 {

    public void a() {
        System.out.println("重写了a方法");
    }

    public void b() {       // 重写default方法是，default必须不能加
        System.out.println("重写了b方法");
    }

    public void c(){
        b();    // OK，非抽象方法可以直接使用
//        super.b();      // 不行！TestInterface不是父类
        TestInterface01.super.b();        // OK，额……
    }

}


class test01 {
    public static void main(String[] args) {
        ImpCls01 t = new ImpCls01();
        t.a();
        t.b();
        t.c();
    }
}
