package com.Abe04.Buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *  字节缓冲输出流
 *  java.io.BufferedOutputStream extends OutputStream
 *
 *  继承自父类的共性成员方法
 *      - void close()：关闭此输出流并释放与流相关联的任何系统资源。
 *      - void flush()：刷新此输出流，并强制将任何缓冲的输出字节写入流。
 *      - void write(byte[] b)：将 b.length个字节写入此输出流。
 *      - void write(byte[] b, int off, int len)：将 len字节从位于偏移量 off的指定 byte阵列写入此输出流。
 *      - void write(int b)：写入指定 byte此输出流。
 *
 *  构造方法：
 *      - BufferedOutputStream(OutputStream out)：创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *      - BufferedOutputStream(OutputStream out, int size)：创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层输出流。
 *      参数：
 *          OutputStream out: 字节输出流
 *              通过传递 FileOutputStream 对象，缓冲流为 FileOutputStream 对象增加一个缓冲区，提高 FileOutputStream 的写入效率
 *          int size：缓冲区大小，不指定则采用默认值
 *
 *  使用步骤（重点）：
 *      1.创建 FileOutputStream 对象，构造方法输入写入路径
 *      2.创建 BufferedOutputStream 对象，构造方法中传递 FileOutputStream 对象，提高 FileOutputStream 对象的效率
 *      3.使用 BufferedOutputStream 对象中的 write() 方法，将数据写入到缓冲区
 *      4.使用 BufferedOutputStream 对象中的 flush() 方法，将缓冲区的数据刷新到文件中
 *      5.释放资源（先调用 flush() 方法刷新数据，第4步可以省略）
 */

public class Demo01BufferedOutputStream {
    public static void main(String[] args) {
        // 1.创建 FileOutputStream 对象，构造方法输入写入路径

        try(OutputStream fos = new FileOutputStream("../a.txt")) {
            // 2.创建 BufferedOutputStream 对象，构造方法中传递 FileOutputStream 对象，提高 FileOutputStream 对象的效率
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            // 3.使用 BufferedOutputStream 对象中的 write() 方法，将数据写入到缓冲区
            bos.write("我把数据写入到了内部缓冲区".getBytes());
            // 4.使用 BufferedOutputStream 对象中的 flush() 方法，将缓冲区的数据刷新到文件中
            bos.flush();
            // 5.释放资源（先调用 flush() 方法刷新数据，第4步可以省略）
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
