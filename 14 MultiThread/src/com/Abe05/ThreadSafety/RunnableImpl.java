package com.Abe05.ThreadSafety;

/**
 * 实现卖票案例
 */

public class RunnableImpl implements Runnable {

    // 定义多线程共享的票源
    private int ticket = 100;

    @Override
    public void run() {
        // 先判断票是否存在
        while (ticket > 0) {
            // 提高安全问题出现的概率，让线程睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 票存在，卖票
            System.out.println(Thread.currentThread().getName() + "正在卖第 " + ticket + " 张票");
            ticket --;
        }
    }
}
