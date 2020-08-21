package com.Abe07.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *  改变打印流的输出目的地
 *  输出语句 System.out.println() 默认在控制台输出
 *  使用 System.setOut() 方法改变输出语句的目的地，可以改为参数中传递的 PrintStream 对象保存的目的地
 *      - static void setOut(PrintStream out): 重新分配“标准”输出流
 */

public class Demo02PrintStream2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("控制台输出");

        PrintStream ps = new PrintStream("../print.txt");
        System.setOut(ps);
        System.out.println("bilibili干杯");
        System.out.println(3.14);
        System.out.println(10000);

        ps.close();
    }
}
