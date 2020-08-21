package com.Abe02.FunctionalProgramming;

/**
 *  使用Lambda优化日志案例
 *
 *  Lambda的特点：延迟加载
 *  使用前提：必须存在函数式接口
 */
public class Demo02Lambda {
    // 定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level, MessageBuilder messageBuilder) {
        // 对日志等级进行判断，如果级别为1，那么调用 MessageBuilder 接口的 builderMessage 方法
        if (level == 1) {
            System.out.println(messageBuilder.buildMessage());
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog()方法，参数 MessageBuilder 是一个函数式接口，所以可以使用Lambda表达式
        showLog(2, ()->{return msg1+msg2+msg3;});
        /*
            使用 Lambda 表达式作为参数传递，仅仅是将参数传递到 showLog() 方法中
            只有满足 level==1 的条件时，
                才会调用 MessageBuilder 中的方法 buildMessage 进行字符串拼接
            如果不满足上述条件，
                则不会执行 MessageBuilder 中的方法 buildMessage
                所以拼接字符串的代码也不会执行
            从而避免了性能浪费
         */
    }
}
