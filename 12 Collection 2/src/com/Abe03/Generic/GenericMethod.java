package com.Abe03.Generic;

/**
    含有泛型的方法：泛型定义在方法的修饰符和返回值之间

    格式：
        修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)) {
            // 方法体 ...
        }
 */

public class GenericMethod {

    // 定义含有泛型的方法
    public <E> void method(E e) {   // 可以传递任意类型
        System.out.println(e);
    }

    // 定义含有泛型的静态方法
    public static <E> void method2(E e) {
        System.out.println(e);
    }
}


class TestGenericMethod {
    public static void main(String[] args) {
        // 实例化对象
        GenericMethod gm = new GenericMethod();
        gm.method("123");
        gm.method(12345);
        gm.method(3.14);
        gm.method('b');

        GenericMethod.method2("1688");
        GenericMethod.method2(3);
        GenericMethod.method2(3.14);
    }
}
