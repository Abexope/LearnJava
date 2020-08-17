package com.Abe01.MainThread;

/**
 * 主线程
 *
 * 单线程程序：Java程序中只有一个线程
 * 执行从main方法开始，从上到下依次执行
 */


public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        Person p2 = new Person("旺财");
        p1.run();
        p2.run();
    }
}
