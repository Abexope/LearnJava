package com.Abe02.StreamIO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *  字节输入流
 *  java.io.InputStream
 *      这个抽象类是表示输入字节流的所有类的超类
 *  子类共性方法
 *      - int read(byte[] b)：从输入流读取一些字节数，并将它们存储到缓冲区 b
 *      - int read(byte[] b, int off, int len)：从输入流读取最多 len字节的数据到一个字节数组
 *      - void reset()：将此流重新定位到上次在此输入流上调用 mark方法时的位置
 *
 *  文件字节输入流
 *  java.io.FileInputStream extends InputStream
 *  作用：将硬盘文件中的数据读取到内存中
 *
 *  构造方法：
 *      FileInputStream(String name)
 *      FileInputStream(File file)
 *      参数：读取文件的数据源
 *          String name：文件的路径
 *          File file：文件
 *      构造方法的作用：
 *          1.创建 FileInputStream 对象
 *          2.将 FileInputStream 对象指向构造方法中要读取的文件
 *
 *  读取数据的原理（ROM -> RAM)
 *      Java程序 -> JVM -> OS -> OS读取数据的方法 -> 读取文件
 *
 *  字节输入流的使用步骤（重点）：
 *      1.创建 FileInputStream 对象，构造方法中绑定要读取的数据源
 *      2.使用 FileInputStream 对象中的 read() 方法读取文件
 *      3.释放资源
 */

public class Demo04FileInputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建 FileInputStream 对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("../a.txt");
        // 2.使用 FileInputStream 对象中的 read() 方法读取文件
        // 读取文件中的一个字节并返回，读到末尾返回-1
        int len = 0;
        while ((len = fis.read()) != -1) {      // 布尔表达式中的语法糖
            System.out.println((char) len);
        }
        // 3.释放资源
        fis.close();
    }
}
