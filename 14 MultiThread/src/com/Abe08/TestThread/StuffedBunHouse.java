package com.Abe08.TestThread;

/**
 * 线程间通信案例：包子铺
 */

public class StuffedBunHouse implements Runnable {
    // 匿名包子铺线程类

    private int i = 1;
    final private Object lock;

    public StuffedBunHouse(Object lock) {
        this.lock = lock;
    }

    @Override
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {

        while (true) {

            synchronized (lock) {
                if (StuffedBun.status) {    // 有包子
                    // 进入等待状态
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {                    // 没有包子
                    System.out.println(Thread.currentThread().getName() + " 开始生产包子，需要5秒钟");
                    // 等待5秒
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    switch (i % 2) {  // 交替生产两种包子
                        case 0: {
                            StuffedBun stuffedBun = new StuffedBun("薄皮", "猪肉大葱");
                            System.out.println(Thread.currentThread().getName() + " 生产一个" + stuffedBun);
                            i++;
                            break;
                        }
                        case 1: {
                            StuffedBun stuffedBun = new StuffedBun("薄皮", "韭菜鸡蛋");
                            System.out.println(Thread.currentThread().getName() + " 生产一个" + stuffedBun);
                            i--;
                            break;
                        }
                        default: {
                            StuffedBun stuffedBun = new StuffedBun("薄皮", "猪肉大葱");
                            System.out.println(Thread.currentThread().getName() + "生产一个" + stuffedBun);
                        }
                    }

                    StuffedBun.status = !StuffedBun.status;     // 包子对象的状态取反
                    lock.notify();      // 唤醒吃货线程
                }
            }

        }
    }

}


class Foodie implements Runnable {
    // 吃货线程
    final private Object lock;

    Foodie(Object lock) {
        this.lock = lock;
    }

    @Override
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {

        while (true) {

            synchronized (lock) {
                if (StuffedBun.status) {        // 有包子
                    System.out.println(Thread.currentThread().getName() + " 吃包子");
                    StuffedBun.status = !StuffedBun.status;         // 包子状态取反

                    System.out.println("\n===============================================\n");

                    lock.notify();      // 唤醒包子铺线程生产包子
                } else {                        // 没有包子
                    // 吃货调用wait使线程进入等待状态
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}


class StuffedBun {
    // 包子类
    private String covered;             // 包子皮
    private String stuffing;            // 包子馅
    public static boolean status = false;     // 包子状态

    public StuffedBun() { }

    public StuffedBun(String covered, String stuffing) {
        this.covered = covered;
        this.stuffing = stuffing;
    }

    @Override
    public String toString() {
        return covered + stuffing + "馅的包子";
    }
}


class Test {
    // 测试类
    public static void main(String[] args) {
        // 实例化同步锁
        final StuffedBun lock = new StuffedBun();      // 同步锁

        // 实例化Runnable对象
        StuffedBunHouse stuffedBunHouse = new StuffedBunHouse(lock);    // 实例化包子铺线程
        Foodie foodie = new Foodie(lock);       // 实例化吃货线程

        // 实例化线程对象
        Thread sbhThread = new Thread(stuffedBunHouse);
        Thread fdThread = new Thread(foodie);
        sbhThread.setName("包子铺");
        fdThread.setName("吃货");

        // 启动线程
        sbhThread.start();
        fdThread.start();

    }
}
