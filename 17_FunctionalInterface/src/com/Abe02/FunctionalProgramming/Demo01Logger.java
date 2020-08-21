package com.Abe02.FunctionalProgramming;

/**
 *  日志案例
 *
 *  以下代码存在性能浪费问题：
 *      调用showLog()方法，传递的参数是拼接后的字符串
 *      先把字符串拼接好，再调用showLog方法
 *      如果Level不是1的话，就没有必要再拼接字符串了
 */
public class Demo01Logger {
    // 定义一个方法，根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String message) {
        // 对日志等级进行判断，如果级别为1，那么输出日志信息
        if (level == 1)
            System.out.println(message);
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog()方法，传递日志级别和日志信息
        showLog(1, msg1+msg2+msg3);
    }
}
