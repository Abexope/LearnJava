package com.Abe02.StringIO;

import java.io.FileWriter;
import java.io.IOException;

/**
 *  使用 try ... catch ... finally 处理IO异常
 *  JDK7之前
 */
public class Demo04IOTryCatch {
    public static void main(String[] args) {

        // 提高fw的作用域，让finally可以使用
        // 在定义变量的时候，可以没有值，但是使用时必须有值
        FileWriter fw = null;

        try {
            fw = new FileWriter("D:/f.txt");
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
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }






    }
}
