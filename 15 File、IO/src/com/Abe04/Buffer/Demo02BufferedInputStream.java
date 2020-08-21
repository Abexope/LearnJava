package com.Abe04.Buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *  字节缓冲输入流
 *  java.io.BufferedInputStream extends InputStream
 *
 *  继承父类的成员方法
 *      - int read(byte[] b)：从输入流读取一些字节数，并将它们存储到缓冲区 b
 *      - int read(byte[] b, int off, int len)：从输入流读取最多 len字节的数据到一个字节数组
 *      - void reset()：将此流重新定位到上次在此输入流上调用 mark方法时的位置
 *
 *  构造方法：
 *      - BufferedInputStream(InputStream in)：
 *          创建一个 BufferedInputStream并保存其参数，输入流 in ，供以后使用。
 *      - BufferedInputStream(InputStream in, int size)：
 *          创建 BufferedInputStream 具有指定缓冲区大小，并保存其参数，输入流 in ，供以后使用。
 *      参数：
 *          InputStream in: 字节输入流
 *              通过传递 FileInputStream 对象，缓冲流为 FileInputStream 对象增加一个缓冲区，提高 FileInputStream 的读取效率
 *          int size：缓冲区大小，不指定则采用默认值
 *  使用步骤（重点）：
 *      1.创建 FileInputSteam 对象，构造方法中绑定尧都区的数据源
 *      2.创建 BufferedInputStream 对象，构造方法中传递 FileInputSteam 对象
 *      3.使用 BufferedInputStream 中的 read() 方法读取文件
 *      4.释放资源
 *
 *
 */

public class Demo02BufferedInputStream {
    public static void main(String[] args) {
        // 1.创建 FileInputSteam 对象，构造方法中绑定尧都区的数据源
        try(InputStream fis = new FileInputStream("../a.txt")) {
            // 2.创建 BufferedInputStream 对象，构造方法中传递 FileInputSteam 对象
            BufferedInputStream bis = new BufferedInputStream(fis);
            // 3.使用 BufferedInputStream 中的 read() 方法读取文件
            int len;
            byte[] bytes = new byte[1024];     // 汉字占3个字节，只有缓冲数组是3的倍数才能将汉字正确读取
            while ((len = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            // 4.释放资源
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
