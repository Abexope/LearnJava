package com.Abe05.ReverseStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 *  练习：转换文件编码
 *      将GBK编码的文件转换为UTF-8编码的文件
 *
 *  分析
 *      1.创建 InputStreamReader 对象，构造方法中传入 FileInputStream 对象和"GBK"编码
 *      2.创建 OutputStreamWriter 对象，构造方法中传入 FileOutputStream 对象和"UTF-8"编码
 *      3.使用 InputStreamReader 对象的 read() 方法读取文件
 *      4.使用 OutputStreamWriter 对象的 write() 方法写入文件
 *      5.释放资源
 */

public class TestReverseEncoding {
    public static void main(String[] args) {
        try (
                // 1.创建 InputStreamReader 对象，构造方法中传入 FileInputStream 对象和"GBK"编码
                FileInputStream fis = new FileInputStream("../gbk.txt");
                // 2.创建 OutputStreamWriter 对象，构造方法中传入 FileOutputStream 对象和"UTF-8"编码
                FileOutputStream fos = new FileOutputStream("../utf8.txt")) {
            // 3.使用 InputStreamReader 对象的 read() 方法读取文件
            InputStreamReader isr = new InputStreamReader(fis, "GBK");
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            int len;
            char[] chars = new char[1];
            while ((len = isr.read(chars)) != -1) {
                System.out.println(new String(chars));
                // 4.使用 OutputStreamWriter 对象的 write() 方法写入文件
                osw.write(new String(chars));
                osw.flush();    // 注意记得刷新缓存区
            }
            // 5.释放资源
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
