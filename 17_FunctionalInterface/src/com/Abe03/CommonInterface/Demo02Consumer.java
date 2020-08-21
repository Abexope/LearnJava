package com.Abe03.CommonInterface;

import java.util.function.Consumer;

/**
 *  Consumer<T> 接口
 *
 *  java.util.function.Consumer<T> 接口则正好与Supplier接口相反，
 *  它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
 */

public class Demo02Consumer {
    /*
        定义一个方法
        方法的参数传递一个字符串的姓名
        方法的参数传递Consumer接口，泛型使用String
        可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        // 调用 method() 方法，传递字符串姓名，方法的另一个参数是 Consumer 接口，是一个函数式接口，可以传递 Lambda 表达式
        method("赵丽颖", (String name)->{
            // 输出字符串
            // System.out.println(name);
            // 反转字符串
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });
    }

}
