package com.Abe02.IO2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  JDK7的新特性：
 *      在try后面增加一个()，在括号中定义流对象
 *      该流对象仅在try中有效
 *      try中的代码执行完毕后自动释放流对象，省去finally代码块
 */
public class Demo05IOTryCatch2 {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("E:/labuladong的算法小抄.pdf");
                FileOutputStream fos = new FileOutputStream("D:/labuladong的算法小抄.pdf")
        ) {
            // 1.创建字节输入流对象，构造方法中输入源文件路径
            // 2.创建字节输出流对象，构造方法中输入目标文件路径
            // 3.使用字节输入流对象的 read() 方法读取源文件
            int len;
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
