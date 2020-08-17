package com.Abe05.ThreadSafety;

/**
 * 线程安全问题
 */

public class Demo01ThreadSafety {
    public static void main(String[] args) {
        // 创建 Runnable 实现类对象
        RunnableImpl window = new RunnableImpl();

        // 对一个Runnable实现类对象启动 3 条售票线程
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
    }
}
