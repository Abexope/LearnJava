package com.Abe07.WaitAndNotify;

/**
 * 线程间通信：无限等待 & 唤醒
 * 案例：包子铺
 *      创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用 wait() 方法，放弃CPU执行权，进入到WAITING状态（无限等待）
 *      创建一个老板线程（生产者）：花了5秒做包子，做好包子之后，调用 notify() 方法，唤醒顾客吃包子
 * 注意：
 *      1.顾客和老板线程必须使用同步代码块包裹，保证等待和唤醒方法在同一时刻只能执行一个
 *      2.同步使用的锁对象必须保证唯一
 *      3.只有锁对象才能调用 wait() 和 notify() 方法
 * Object类中的方法
 *      - void wait(): 在其它线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待
 *      - void notify(): 唤醒在此对象监视器上等待的单个线程，会继续执行 wait() 方法之后的代码
 */

// 交替同步等待示例
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        final Object obj = new Object();

        // 创建一个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                // 一直等着买包子
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + ": 告知老板要的包子的种类和数量");

                        try {
                            obj.wait();     // 调用 wait() 方法，放弃CPU执行权，进入到WAITING状态（无限等待）
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + ": 吃包子");
                        System.out.println("=====================================================");

                        // 执行完吃包子后马上唤醒正在等待的老板线程
                        obj.notify();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                // 一直在卖包子
                while (true) {

                    // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {

                        System.out.println(Thread.currentThread().getName() + ": 花了5秒做包子");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + ": 包子做好了，可以吃了");

                        obj.notify();   // 调用 notify() 方法，唤醒顾客吃包子

                        // 释放锁后马上进入等待
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
    }
}
