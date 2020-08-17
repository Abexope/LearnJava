package com.Abe02.Thread;

/**
 * Thread类
 *
 * 常用方法：
 *      - String getName()：获取线程名称
 *      - public MyThread currentThread(): 获取当前正在执行的线程对象的引用
 *      - public static void sleep(long millis): 使当前正在执行的线程以指定的毫秒数暂停一段时间
 */

// 1.定义一个Thread类的子类
public class MyThread extends Thread {

    public MyThread() { }

    public MyThread(String name) {
        super(name);
    }

    // 2.在Thread类的子类中重写 run() 方法，设置线程任务（开启线程要做什么?）
    @Override
    public void run() {
        /*for (int i = 0; i < 2000; i++) {
            System.out.println(this.getName() + ": " + i);
        }*/
//        System.out.println(this.getName());
//        Thread t = Thread.currentThread();
//        System.out.println(t);
//        String name = t.getName();
//        System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }
}
