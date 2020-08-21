package com.Abe02.StringIO;

import java.io.FileWriter;
import java.io.IOException;

/**
 *  字符输出流
 *
 *  java.io.Writer
 *      字符输出流的顶层抽象类
 *
 *  共性成员方法
 *      - abstract void close()：关闭流，先刷新。
 *      - abstract void flush()：刷新流。
 *      - void write(int c)：写一个字符
 *      - void write(char[] cbuf)：写入一个字符数组。
 *      - abstract void write(char[] cbuf, int off, int len)：写入字符数组的一部分。
 *      - void write(String str)：写一个字符串
 *      - void write(String str, int off, int len)：写一个字符串的一部分。
 *
 *  文件字符输出流
 *  java.io.FileWriter extends OutputStreamWriter extends Writer
 *  作用：将内存中的字符数据写入到文件中
 *
 *  构造方法：
 *      FileWriter(File file): 根据给定的 File 对象构造一个 FileWriter 对象
 *      FileWriter(String filename): 根据给定的文件名构造一个 FileWriter 对象
 *      作用：
 *          1.创建 FileWriter 对象
 *          2.根据构造方法中传入的路径创建文件
 *          3.将 FileWriter 对象指向创建好的文件
 *
 *  字符出输出流的使用步骤（重点）：
 *      1.创建 FileWriter 对象，构造方法中传入待写入文件的路径
 *      2.使用 FileWriter 中的 write() 方法，将数据写入到内存缓冲区中（字符转换为字节的过程）
 *      3.使用 FileWriter 中的 flush() 方法，将内存缓冲区中的数据刷新到文件中
 *      4.释放资源（会先将内存缓冲区中的数据刷新到文件中）
 */

public class Demo02FileWriter {
    public static void main(String[] args) throws IOException {
        // 1.创建 FileWriter 对象，构造方法中传入待写入文件的路径
        FileWriter fw = new FileWriter("../c.txt");
        // 2.使用 FileWriter 中的 write() 方法，将数据写入到内存缓冲区中（字符转换为字节的过程）
        // 写入单个字符
        fw.write(97);
        // 3.使用 FileWriter 中的 flush() 方法，将内存缓冲区中的数据刷新到文件中
        fw.flush();
        // 4.释放资源（会先将内存缓冲区中的数据刷新到文件中）
        fw.close();

        /*
            flush 与 close 的区别：
                - flush: 刷新缓冲区，流对象可以继续使用
                - close: 先刷新缓冲区，然后通知系统释放资源。流对象不可再使用
         */

    }
}
