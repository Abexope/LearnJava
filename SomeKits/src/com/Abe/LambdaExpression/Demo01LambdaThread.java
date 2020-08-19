package com.Abe.LambdaExpression;

/**
 * 初识Lambda：
 *      使用Lambda表达式创建线程
 *
 * Lambda表达式的标准形式：
 *      由三部分组成：
 *          a.一些参数
 *          b.一个箭头
 *          c.一段代码
 *      格式：
 *          (参数列表) -> {一些重写方法的代码};
 *      格式说明：
 *          ()：接口中抽象方法的参数列表，没有参数就空着；有参数就写出参数，多个参数使用逗号分隔
 *          ->：传递的意思，把参数传递给方法体{}
 *          {}：重写接口中的抽象方法体
 */

public class Demo01LambdaThread {
    public static void main(String[] args) {
        // 使用匿名内部类方式创建线程
        new Thread(
            new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ": 创建线程");
                }
            }
        ).start();

        // 使用Lambda表达式实现多线程
        new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ": 创建线程");
            }
        ).start();

        Runnable t = () -> {    // 使用 Runnable 接口接收匿名表达式
            System.out.println(Thread.currentThread().getName() + ": 创建线程");
        };
        new Thread(t).start();

    }
}
