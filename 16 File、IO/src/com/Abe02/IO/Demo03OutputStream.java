package com.Abe02.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *  追加续写
 *      - FileOutputStream(File file, boolean append): 创建文件输出流以写入由指定的 File 对象表示的文件。
 *      - FileOutputStream(String name, boolean append): 创建文件输出流以指定的名称写入文件。
 *      boolean append:
 *          true: 创建对象不会覆盖源文件，继续在文件末尾追加续写
 *          false: 创建一个新文件，覆盖原文件
 *
 *  换行续写
 *      在字节数组中添加换行符
 *      Windows：\r\n（实测\n也OK）
 *      Linux：\n
 *      MacOS：\r
 *
 *
 */

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建 FileOutputStream 对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("../a.txt"), true);    // 追加写
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
        byte[] bytes2 = "\n你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        for (int i = 0; i < 10; i++) {
            fos.write(bytes2);
        }


        // 释放资源n
        fos.close();
    }

}
