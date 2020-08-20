package com.Abe04.Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  字符缓冲输出流
 *
 *  java.io.BufferWriter extends Writer
 *      - abstract void close()：关闭流，先刷新。
 *      - abstract void flush()：刷新流。
 *      - void write(int c)：写一个字符
 *      - void write(char[] cbuf)：写入一个字符数组。
 *      - abstract void write(char[] cbuf, int off, int len)：写
 *      - void write(String str)：写一个字符串
 *      - void write(String str, int off, int len)：写一个字符串的一部分。
 *
 *  构造方法：
 *      - BufferedWriter(Writer out)：创建使用默认大小的输出缓冲区的缓冲字符输出流。
 *      - BufferedWriter(Writer out, int sz)：创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
 *      参数：
 *          Writer out: 字符输出流
 *              通过传递 FileWriter 对象，缓冲流为 FileWriter 对象增加一个缓冲区，提高 FileWriter 的写入效率
 *          int sz: 缓冲区大小，不写采用默认值
 *
 *  特有的成员方法：
 *      - void newLine()：写一行行分隔符。根据不同的操作系统获取不同的行分隔符
 *
 *  使用步骤：
 *      1.创建 BufferWriter 对象，构造方法中传递字符输出流
 *      2.调用 BufferWriter 的 write() 方法，将数据写入到内存缓冲区中
 *      3.调用 BufferWriter 的 flush() 方法，将缓冲区中的数据刷新到文件中
 *      4.释放资源
 *
 */
public class Demo03BufferedWriter {
    public static void main(String[] args) {
        // 1.创建 BufferWriter 对象，构造方法中传递字符输出流
        try(FileWriter fw = new FileWriter("../prop.txt")) {
            // 2.调用 BufferWriter 的 write() 方法，将数据写入到内存缓冲区中
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                bw.write("艾比Abe" + i);
                bw.newLine();
                // 3.调用 BufferWriter 的 flush() 方法，将缓冲区中的数据刷新到文件中
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
