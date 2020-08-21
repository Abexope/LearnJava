package com.Abe02.FunctionalProgramming;

/**
 *  java.lang.Runnable 接口就是一个函数式接口，
 *  假设有一个 startThread 方法使用该接口作为参数，那么就可以使用Lambda进行传参。
 *  这种情况其实和 Thread 类的构造方法参数为 Runnable 没有本质区别。
 */

public class Demo03Runnable {
    // 定义一个方法 startThread，方法的参数使用函数式接口 Runnable
    public static void startThread(Runnable run) {
        // 开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        // 调用 startThread() 方法，方法的参数是一个接口，那么可以传递接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": " + "线程启动");
            }
        });

        // 调用 startThread() 方法，方法的参数是一个函数式接口，可以使用Lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + ": " + "线程启动");
        });

        // 简化Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + ": " + "线程启动"));
    }
}
