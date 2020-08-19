package com.Abe09.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池（JDK1.5+）
 *
 *  java.util.concurrent.Executors: 线程池的工厂类，用来生成线程池
 *  Executors类中的静态方法：
 *      - static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池
 *      参数：
 *          int nThreads: 创建线程池中包含的线程数量
 *      返回值：
 *          ExecutorService接口，返回的是ExecutorService接口的实现类对象，可以使用ExecutorService接口接收（面向接口编程）
 *
 *  java.util.concurrent.ExecutorService：线程池接口，用来从线程池中获取线程对象，调用 start() 方法，执行线程任务
 *      - submit(Runnable task): 提交一个 Runnable 任务用于执行
 *      - void shutdown(): 关闭/销毁线程池的方法（不常用）
 *
 *  使用线程池的流程：
 *      1.使用线程池工厂类中的静态方法 Executors.newFixedThreadPool 生产一个指定线程数量的线程池
 *      2.定义一个 Runnable 接口的实现类，重写 run() 方法，设置线程任务
 *      3.调用 ExecutorService 中的 submit(Runnable task) 方法，传递线程任务（实现类对象），启动线程，执行 run() 方法
 *      4.调用 ExecutorService 中的 shutdown() 方法销毁线程池（不建议手动执行）
 */

public class Demo01ThreadPool {
    public static void main(String[] args) {
        // 1.使用线程池工厂类中的静态方法 Executors.newFixedThreadPool 生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);   // 返回的是线程池接口的实现类

        // 3.调用 ExecutorService 中的 submit(Runnable task) 方法，传递线程任务（实现类对象），启动线程，执行 run() 方法
        es.submit(new RunnableImpl());      // pool-1-thread-1 创建一个新线程
        // 线程池会一直开启，使用完线程后，会自动将线程归还给线程池，线程可以继续使用

        es.submit(new RunnableImpl());      // pool-1-thread-2 创建一个新线程
        es.submit(new RunnableImpl());      // pool-1-thread-1 创建一个新线程（复用线程）

        // 4.调用 ExecutorService 中的 shutdown() 方法销毁线程池（不建议手动执行）
        es.shutdown();  // 线程池销毁后就无法再从中获取线程
    }
}



// 2.定义一个 Runnable 接口的实现类，重写 run() 方法，设置线程任务
class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 创建一个新线程");
    }
}
