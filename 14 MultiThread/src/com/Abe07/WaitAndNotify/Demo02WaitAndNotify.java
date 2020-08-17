package com.Abe07.WaitAndNotify;

/**
 * 线程间通信：计时等待
 *
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        final Object obj = new Object();

        // 创建一个顾客线程（消费者）
        new Thread("顾客1") {
            @Override
            public void run() {
                // 一直等着买包子
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + ": 告知老板要的包子的种类和数量");

                        try {
                            // obj.wait(5000);     // 调用 wait(long mill) 方法，放弃CPU执行权，进入到 TIME WAITING状态（计时等待）
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + ": 吃包子");
                        System.out.println("=====================================================");

                        // 执行完吃包子后马上唤醒正在等待的老板线程
                        obj.notifyAll();
                    }
                }
            }
        }.start();

        // 创建一个顾客线程（消费者）
        new Thread("顾客2") {
            @Override
            public void run() {
                // 一直等着买包子
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + ": 告知老板要的包子的种类和数量");

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + ": 吃包子");
                        System.out.println("=====================================================");

                        // 执行完吃包子后马上唤醒正在等待的老板线程
                        obj.notifyAll();
                    }
                }
            }
        }.start();


        new Thread("老板") {
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

//                        obj.notify();   // 调用 notify() 方法，唤醒顾客吃包子
                        obj.notifyAll();

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
