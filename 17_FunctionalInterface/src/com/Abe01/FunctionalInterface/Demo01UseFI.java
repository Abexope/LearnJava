package com.Abe01.FunctionalInterface;

/**
 *  使用函数式接口：可以作为方法的参数和返回值类型
 */

public class Demo01UseFI {
    // 定义一个方法，参数使用函数式接口 com.Abe01.FunctionalInterface.MyFunctionalInterface
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        // 可以传入接口的实现类
        show(new MyFunctionalInterfaceImpl());

        // 可以传入接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("重写接口方法");
            }
        });

        // 可以使用Lambda表达式
        show(()->{
            System.out.println("Lambda表达式");
        });

    }
}
