package com.Abe05.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 *  字节转换输出流
 *
 *  java.io.OutputStreamWriter extends Writer
 *      OutputStreamWriter 是字符的桥梁流以字节流：向其写入的字符编码成使用指定的字节charset
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
 *  构造方法
 *      - OutputStreamWriter(OutputStream out)：创建一个使用默认字符编码的OutputStreamWriter。
 *      - OutputStreamWriter(OutputStream out, String charsetName)：创建一个使用命名字符集的OutputStreamWriter。
 *      参数：
 *          OutputStream out：字节输出流，用来写入转换后的字节到文件中
 *          String charsetName：指定的编码表，不区分大小写，如'GBK'，'gbk'，……
 *
 *  使用步骤
 *      1.创建 OutputStreamWriter 对象，构造方法传入 FileOutputStream 对象和指定的编码格式
 *      2.使用 OutputStreamWriter 对象的 write() 方法，将字符转化为字节存储至缓冲区（编码）
 *      3.使用 OutputStreamWriter 对象的 flush() 方法，将缓冲区中的字节刷新到文件中（使用字节流写入字节的过程）
 *      4.释放资源
 */

public class Demo01OutputStreamWriter {
    public static void main(String[] args) {
        writeUtf8();
        writeGBK();
    }

    /*
        使用转换流 OutputStreamWriter 写 GBK 格式的文件
     */
    private static void writeGBK() {
        // 1.创建 OutputStreamWriter 对象，构造方法传入 OutputStream 对象和指定的编码格式
        try (FileOutputStream fos = new FileOutputStream("../gbk.txt")) {
            OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
            // 2.使用 OutputStreamWriter 对象的 write() 方法，将字符转化为字节存储至缓冲区（编码）
            osw.write("你好");
            // 3.使用 OutputStreamWriter 对象的 flush() 方法，将缓冲区中的字节刷新到文件中（使用字节流写入字节的过程）
            osw.flush();
            // 4.释放资源
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        使用转换流 OutputStreamWriter 写 UTF-8 格式的文件
     */
    private static void writeUtf8() {
        // 1.创建 OutputStreamWriter 对象，构造方法传入 OutputStream 对象和指定的编码格式
        try (FileOutputStream fos = new FileOutputStream("../utf8.txt")) {
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            // 2.使用 OutputStreamWriter 对象的 write() 方法，将字符转化为字节存储至缓冲区（编码）
            osw.write("你好");
            // 3.使用 OutputStreamWriter 对象的 flush() 方法，将缓冲区中的字节刷新到文件中（使用字节流写入字节的过程）
            osw.flush();
            // 4.释放资源
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
