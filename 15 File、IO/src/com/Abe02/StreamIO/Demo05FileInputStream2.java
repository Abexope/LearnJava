package com.Abe02.StreamIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *  文件字节输出流
 *
 *  一次向文件中读取多个字节
 *      - int read(byte[] b)：从该输入流读取最多 b.length个字节的数据为字节数组
 *  明确两件事：
 *      1.方法的参数 byte[] 的作用?
 *          起到缓冲作用，存储每次读到的多个字节
 *          数组的长度一般定义为1024(1kb)或者1024的整数倍
 *      2.方法返回的 int 变量是什么?
 *          每次读取的有效字节数
 *
 *  String类的构造方法
 *      - String(byte[] bytes): 将字节数组转换为字符串
 *      - String(byte[] bytes, int offset, int length): 将字节数组的一部分转化为字符串
 *          offset：数组的开始索引
 *          length：转换的字节个数
 */

public class Demo05FileInputStream2 {
    public static void main(String[] args) throws IOException {
        // 1.创建 FileInputStream 对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("../b.txt");
        // 2.使用 FileInputStream 对象中的 read() 方法读取文件
        byte[] bytes = new byte[2];     // 2: 缓冲字节数
        int len;    // 读取的有效字节个数

        while ((len = fis.read(bytes)) != -1) {
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes, 0, len));    // 截取有效字节
        }


        // 3.释放资源
        fis.close();
    }
}
