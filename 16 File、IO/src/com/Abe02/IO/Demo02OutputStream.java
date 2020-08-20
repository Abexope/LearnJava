package com.Abe02.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *  文件字节输出流
 *
 *  一次向文件中写入多个字节
 *      - public void write(byte[] b): 将 b.length 字节从指定的字节数组写入此输出流
 *      - public void write(byte[] b, int off, int len): 从指定的字节数组写入 len 字节，从偏移量 off 开始输出到此输出流
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建 FileOutputStream 对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("../a.txt"));
        // 2.调用 FileOutputStream 对象中的方法 write，将数据写入到文件中
        // 在文件中显示100
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            public void write(byte[] b): 将 b.length 字节从指定的字节数组写入此输出流
            一次写入多个字节：
                若写入的第一个字节是正数(0~127)，那么显示时会查询ASCII表
                若写入的第一个字节是负数，那么前两个字节将组成一个GBK汉字编码
         */
        byte[] bytes = {-65, -66, -67, 68, 69};
        fos.write(bytes);

        /*
            public void write(byte[] b, int off, int len): 从指定的字节数组写入 len 字节，从偏移量 off 开始输出到此输出流
                int off: 数组的开启索引
                int len: 写入字节的长度
         */
        fos.write(bytes, 1, 2);

        /*
            写入字符串的方法：可以使用 String 类中的方法将字符串转换成字节数组
                byte[] getBytes(): 将字符串转换为字节数组
         */
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);

        // 释放资源
        fos.close();
    }
}
