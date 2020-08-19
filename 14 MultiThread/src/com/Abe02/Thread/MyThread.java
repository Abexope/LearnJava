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
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1);      // 使用Thread.sleep增加线程阻塞几率
            } catch (InterruptedException e) {
                e.printStackTrace();        // sleep() 方法需要处理中断异常
            }
            // 打印当前线程名称的两种方式
            // System.out.println(Thread.currentThread().getName());
            // 通过Thread类的静态方法调用线程名
            System.out.println(this.getName() + ": " + i);
            // 由于继承了Thread类，因此可以使用this直接调用getName()方法
        }
    }
}
