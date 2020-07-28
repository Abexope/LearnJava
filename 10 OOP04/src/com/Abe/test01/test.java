package com.Abe.test01;

/**
 * final 关键字
 */

public class test {

    public static void main(String[] args) {
        // final 修饰一个变量，变量的值不可以改变，这个变量也变成一个字符常量，名字大写，类C/C++ 的const

        // 第1种情况
        final int A = 10;       // final 修饰基本数据类型
//         A = 20;              // 报错：不可以修改final修饰的变量！

        // 第2种情况
        final Dog d = new Dog();
//        d = new Dog();        // 异常，final变量不能修改

        d.age = 12;             // OK，堆中的属性依然可以修改
        d.weight = 13;

        // 第3种情况
        final Dog d2 = new Dog();
        a(d2);                  // OK

        // 第4种情况
        b(d2);
    }

    public static void a(Dog d) {
        d = new Dog();
    }

    public static void b(final Dog d) {
        // 局部变量被final修饰，b的方法栈帧中，形参d的地址被锁定，不可修改
//        d = new Dog();        // 异常
    }

}
