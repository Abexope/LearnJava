package com.Abe02.IO2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *  字符输入流
 *
 *  java.io.Reader
 *      字符输入流的顶层抽象类
 *
 *  共性成员方法
 *      - int read()：读一个字符
 *      - int read(char[] cbuf)：将字符读入数组。
 *      - abstract void close()：关闭流并释放与之相关联的任何系统资源
 *
 *  文件字符输入流
 *  java.io.FileReader extends InputStreamReader extends Reader
 *  作用：将硬盘中的数据以字符形式读取到内存中
 *
 *  构造方法：
 *      - FileReader(File file)：创建一个新的 FileReader ，给出 File 读取
 *      - FileReader(String fileName)：创建一个新的 FileReader ，给定要读取的文件的名称
 *      作用：
 *          1.创建一个 FileReader 对象
 *          2.将 FileReader 对象指向要读取的文件
 *
 *  字符输入流的使用步骤
 *      1.创建 FileReader 对象，构造方法中绑定要读取的数据源
 *      2.使用 FileReader 对象中的 read() 方法读取文件
 *      3.释放资源
 */

public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        // 1.创建 FileReader 对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("../b.txt");
        // 2.使用 FileReader 对象中的 read() 方法读取文件
        // 方法一：单字符读写
//        int len;
//        while ((len = fr.read()) != -1){
//            System.out.println(len + ": " + (char)len);
//        }
        // 方法二：多字符读写
        int len;
        char[] chars = new char[3];
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));      // 截取有效长度
        }
    }
}
