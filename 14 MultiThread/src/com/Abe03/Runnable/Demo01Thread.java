package com.Abe03.Runnable;

/**
 * 创建多线程程序的第二种方式：实现Runnable接口（常用）
 * java.lang.Runnable
 *      Runnable接口应该有那些大选通过某一线程执行其实例的类实现。类必须定义一个称为run的无参数方法
 * java.lang.Thread类的构造方法
 *      Thread(Runnable target)：分配新的 Thread 对象
 *      Thread(Runnable target, String name)：分配新的Thread对象
 *
 * 实现步骤：
 *      1.定义一个Runnable接口的实现类
 *      2.在实现类中重写Runnable接口的 run() 方法，设置线程任务
 *      3.实例化一个Runnable接口的实现类对象
 *      4.实例化一个Thread类对象，向构造方法中传递Runnable接口的实现类对象
 *      5.调用Thread类对象的 start() 方法，开启新的线程执行 run() 方法
 *
 * 实现Runnable接口创建多线程程序的优势（与使用Threading类实现多线程的区别）
 *      1.避免单继承的局限性
 *          Java是单继承的，线程类继承了Thread类后就无法再引入其它特性，
 *          而通过实现Runnable接口仍然可以继承/实现其它类/接口，保证了线程类的拓展性
 *      2.增强了程序的扩展性，降低了程序的耦合性（解耦）
 *          实现Runnable接口，将`设置线程任务`和`启动线程`分离
 *          实现类中：重写run()方法：用来设置线程任务
 *          实例化Thread类对象，调用start()方法：用来开启新线程
 */

public class Demo01Thread {
    public static void main(String[] args) {
        // 3.实例化一个Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 4.实例化一个Thread类对象，向构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(run);     // 开启子线程
        // 5.调用Thread类对象的 start() 方法，开启新的线程执行 run() 方法
        t.start();

        new Thread(new RunnableImpl2()).start();    // 传递不同的实现类，实现不同的任务

        // 主线程
        for (int i = 0; i < 2000; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

    }
}
