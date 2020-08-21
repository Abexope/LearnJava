package com.Abe02.Reference;

/**
 *  定义一个打印的函数式接口
 */
@FunctionalInterface
interface Printable {
    void print(String s);
}


public class Demo01Printable {

    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        /*
            Lambda表达式：打印参数传递的字符串
            将参数 s 传递给 System.out 对象，调用 out 对象中的 println() 方法打印字符串
            注意：
                1.System.out 对象已经存在
                2.println 方法已经存在
            使用`方法引用`来优化Lambda表达式
            可以使用 System.out 方法直接引用(调用) println() 方法
         */
        printString(System.out::println);
        // 双冒号`::`  方法引用运算符
    }
}