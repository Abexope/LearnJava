package com.Abe02.StreamIO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  字节输出流
 *  java.io.OutputStream
 *      此抽象类表示输出字节流类的超类
 *  子类通用方法
 *      - public void close(): 关闭此输出流并释放与此流相关联的任何系统资源
 *      - public void flush(): 刷新输出流并强制任何缓冲的输出字节被写出
 *      - public void write(byte[] b): 将 b.length 字节从指定的字节数组写入此输出流
 *      - public void write(byte[] b, int off, int len): 从指定的字节数组接入 len 字节，从偏移量 off 开始输出到此输出流
 *      - public abstract void write(int b): 将指定字节写入此输出流
 *
 *  文件字节输出流
 *  java.io.FileOutputStream extends OutputStream：字节输出流的子类之一
 *  作用：将内存中的数据写入到硬盘文件中
 *
 *  构造方法：
 *      - FileOutputStream(String name): 创建一个向具有指定名称的文件中写入数据的输出文件流
 *      - FileOutputStream(File file): 创建一个向指定 File 对象表示的文件中写入数据的文件输出流
 *      参数：数据的保存位置
 *          String name: 文件路径
 *          File file: 文件名称
 *      构造方法的作用：
 *          1.创建一个 FileOutputStream 对象
 *          2.根据构造方法传递的文件/文件路径创建一个空文件
 *          3.将 FileOutputStream 对象指向创建好的文件
 *
 *  写入数据的原理（RAM -> ROM）
 *      Java程序 -> JVM -> OS(操作系统) -> OS调用写数据的方法 -> 将数据写入到文件中
 *
 *  字节输出流的使用步骤（重点）
 *      1.创建 FileOutputStream 对象，构造方法中传递写入数据的目的地
 *      2.调用 FileOutputStream 对象中的方法 write，将数据写入到文件中
 *      3.释放资源（流对象会占用一定的内存，使用完毕后要把内存清空，提高程序效率）
 */

public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {     // 三行代码均会抛出异常，均属于IOException或者它的子类
        // 1.创建 FileOutputStream 对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("..\\a.txt");
        // 2.调用 FileOutputStream 对象中的方法 write，将数据写入到文件中
        fos.write(97);
        // 3.释放资源（流对象会占用一定的内存，使用完毕后要把内存清空，提高程序效率）
        fos.close();
    }
}
