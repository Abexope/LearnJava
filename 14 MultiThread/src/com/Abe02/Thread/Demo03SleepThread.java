package com.Abe02.Thread;

/**
 * 线程暂停
 *      - public static void sleep(long millis): 使当前正在执行的线程以指定的毫秒数暂停一段时间
 */
public class Demo03SleepThread {
    public static void main(String[] args) {
        // 模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
