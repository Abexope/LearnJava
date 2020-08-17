package com.Abe02.Thread;

/**
 * 线程名称
 *      主线程：main
 *      新线程：Thread-0, Thread-1, Thread-2, ...
 */
public class Demo02GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread("旺财");
        mt.start();

//        new MyThread().start();
//        new MyThread().start();
        for (int i = 0; i < 20; i++) {
            new MyThread().start();
        }
    }
}
