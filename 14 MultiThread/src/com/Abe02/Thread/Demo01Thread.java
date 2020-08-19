package com.Abe02.Thread;

/**
 * 创建多线程程序的第一种方式：创建Thread子类
 * java.lang.Thread类：描述线程的类，实现多线程必须继承这个类
 *
 * 实现步骤：
 *      1.定义一个Thread类的子类
 *      2.在Thread类的子类中重写Thread类中的 run() 方法，设置线程任务（开启线程要做什么?）
 *      3.实例化Thread子类对象
 *      4.调用Thread类中的 start() 方法，启动新线程，执行 run() 方法
 *          - void start(): 使该线程开始执行；Java虚拟机调用该线程的 run() 方法
 *          结果是两个线程并发地执行：即当前线程（main线程）和另一个线程（实例化的新线程对象，执行其 run() 方法）
 * 注意：
 *      1.多次启动一个线程是非法的。当线程已经结束执行后，不能再重新启动
 *      2.Java程序是`抢占式线程调度`，优先级高的线程优先执行，优先级相同的线程随机执行
 */
public class Demo01Thread {
    public static void main(String[] args) {

        // 3.实例化Thread子类对象
        MyThread mt1 = new MyThread();
        // 4.调用Thread类中的 start() 方法，启动新线程，执行 run() 方法
        mt1.start();

        MyThread mt2 = new MyThread();
        // 4.调用Thread类中的 start() 方法，启动新线程，执行 run() 方法
        mt2.start();

        // 主线程方法
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main: " + i);
        }
    }
}
