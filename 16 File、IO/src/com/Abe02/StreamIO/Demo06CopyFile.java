package com.Abe02.StreamIO;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  IO练习：文件复制（一读一写）
 *
 *  文件复制步骤：
 *      1.创建字节输入流对象，构造方法中输入源文件路径
 *      2.创建字节输出流对象，构造方法中输入目标文件路径
 *      3.使用字节输入流对象的 read() 方法读取源文件
 *      4.使用字节输出流对象的 write() 方法写入目标文件
 *      5.释放资源
 */

public class Demo06CopyFile {
    public static void main(String[] args) throws IOException {
        // 1.创建字节输入流对象，构造方法中输入源文件路径
        FileInputStream fis = new FileInputStream("E:/labuladong的算法小抄.pdf");
        // 2.创建字节输出流对象，构造方法中输入目标文件路径
        FileOutputStream fos = new FileOutputStream("D:/labuladong的算法小抄.pdf");
        // 3.使用字节输入流对象的 read() 方法读取源文件
        // 方法一：一次读写一个字节
//        int len;
//        while ((len = fis.read()) != -1) {
//            fos.write(len);
//        }
        // 方法二：使用数组缓冲，一次读写多个字节
        int len;
        byte[] buffer = new byte[1024];
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }


        fis.close();
        fos.close();
    }
}
