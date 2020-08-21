package com.Abe03.CommonInterface;

import java.util.function.Consumer;

/**
 *  Consumer 接口的默认方法 andThen()
 *  作用：需要两个 Consumer 接口，可以将两个 Consumer 接口组合到一起，再对数据进行消费
 *
 *  例如：
 *      Consumer<String> con1
 *      Consumer<String> con2
 *      String s = "Hello";
 *      con1.accept(s);
 *      con2.accept(s);
 *
 *  连接两个 Consumer 接口，再进行消费，谁写在前面，谁再消费
 *      con1.andThen(con2).accept(s);
 */

public class Demo03andThen {
    // 定义一个方法，方法的参数传递一个字符串和两个 Consumer 接口，Consumer 接口的泛型采用 String
    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);   // 使用 andThen 简化代码
    }

    public static void main(String[] args) {
        // 调用 method() 方法，传递一个字符串，两个 Lambda 表达式
        method("Hello", (t)->{
            System.out.println(t.toUpperCase());
        }, (t)->{
            System.out.println(t.toLowerCase());
        });
    }
}


class Demo03andThen2 {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马儿扎哈,男"};
        printInfo(arr, (message)->{
            String name = message.split(",")[0];
            System.out.print("姓名：" + name);
        }, (message)->{
            String age = message.split(",")[1];
            System.out.println("   性别：" + age);
        });
    }
}
