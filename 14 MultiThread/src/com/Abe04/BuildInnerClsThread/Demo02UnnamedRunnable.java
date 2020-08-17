package com.Abe04.BuildInnerClsThread;

public class Demo02UnnamedRunnable {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        };
        new Thread(run).start();

        // 主线程
        for (int i = 0; i < 2000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
