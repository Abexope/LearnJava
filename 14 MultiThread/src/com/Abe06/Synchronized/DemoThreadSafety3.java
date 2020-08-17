package com.Abe06.Synchronized;


import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决实现卖票案例中线程安全问题
 *
 * 方案三：使用Lock锁(JDK1.5+)
 *  java.util.concurrent.locks.Lock接口
 *      Lock实现提供了比使用 synchronized 方法和语句可获得更广泛的锁定操作
 *
 *  Lock接口中的方法：
 *      - void lock(): 获取锁
 *      - void unlock(): 释放锁
 *  Lock接口的实现类：
 *      java.util.concurrent.locks.ReentrantLock
 *
 *  使用步骤：
 *      1.在成员位置实例化一个 ReentrantLock 对象
 *      2.在可能出现线程安全问题的代码前调用 Lock 接口中的方法 lock() 获取锁
 *      3.在可能出现线程安全问题的代码后调用 Lock 接口中的方法 unlock() 获取锁
 */

public class DemoThreadSafety3 {
    public static void main(String[] args) {
        // 创建 Runnable 实现类对象
        Runnable window = new RunnableImpl03();

        // 对一个Runnable实现类对象启动 3 条售票线程
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
    }
}


class RunnableImpl03 implements Runnable {

    // 定义多线程共享的票源
    private int ticket = 1000;

    // 创建一个 ReentrantLock 对象
    final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(1);    // 维护线程公平性
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                lock.lock();    // 获取锁
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " 正在卖第 " + ticket + " 张票");
                    ticket--;
                } else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {     // 将释放锁放在finally代码块中，无论是否出现异常，最终都会释放线程锁
                lock.unlock();  // 释放锁
            }

        }
    }
}


