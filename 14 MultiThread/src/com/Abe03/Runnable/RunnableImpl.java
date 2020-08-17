package com.Abe03.Runnable;

// 1.定义一个Runnable接口的实现类
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        // 2.在实现类中重写Runnable接口的 run() 方法，设置线程任务
        for (int i = 0; i < 2000; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
