package com.Abe06.Synchronized;

/**
 * 解决实现卖票案例中线程安全问题
 *
 * 方案一：使用同步代码块
 * 格式：
 *      synchronized(锁对象) {
 *          可能会出现线程安全问题的代码（访问了共享数据的代码）
 *      }
 * 注意：
 *      1.通过代码块中的锁对象，可以使用任意类的实例化对象例如 Object 类
 *      2.必须保证多个线程使用的锁对象是同一个
 *      3.锁对象的作用：把同步代码块锁住，只让一个线程在同步代码块中执行
 *      4.锁对象尽量使用final修饰为不可变对象
 */

public class DemoThreadSafety1 {
    public static void main(String[] args) {
        // 创建 Runnable 实现类对象
        Runnable window = new RunnableImpl01();

        // 对一个Runnable实现类对象启动 3 条售票线程
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
    }
}


class RunnableImpl01 implements Runnable {

    // 定义多线程共享的票源
    private int ticket = 100;

    // 创建一个锁对象
//    final Object obj = new Object();

    @Override
    public void run() {
        /*run方法中可以执行很多代码，而同步代码块只是一小部分。
        出去同步代码块都是并发执行的，只不过到了同步代码块才会同步。
        比如，买票之前你会跟柜台小姐姐询问票价等业务，多个柜台同步，只不过在出票这一环节同步*/
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (RunnableImpl01.class) {       // 可以将自己作为同步锁，可以将本类属性作为锁对象
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " 正在卖第 " + ticket + " 张票");
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}