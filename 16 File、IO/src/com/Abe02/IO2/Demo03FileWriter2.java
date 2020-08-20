package com.Abe02.IO2;

import java.io.FileWriter;
import java.io.IOException;

/**
 *  字符输出流的其它写入方法
 *      - void write(char[] cbuf)：写入一个字符数组。
 *      - abstract void write(char[] cbuf, int off, int len)：写入字符数组的一部分。
 *      - void write(String str)：写一个字符串
 *      - void write(String str, int off, int len)：写一个字符串的一部分。
 */

public class Demo03FileWriter2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("../f.txt", true);
        char[] cs = {'a', 'b', 'c', 'd', 'e'};

        // void write(char[] cbuf)：写入一个字符数组。
        fw.write(cs);
        fw.flush();

        // abstract void write(char[] cbuf, int off, int len)：写入字符数组的一部分。
        fw.write(cs, 1, 3);
        fw.flush();

        // void write(String str)：写一个字符串
        fw.write("艾比Abe");
        fw.flush();

        // void write(String str, int off, int len)：写一个字符串的一部分。
        fw.write("\n艾比Abe", 0, 3);
        fw.flush();

        fw.close();
    }
}
