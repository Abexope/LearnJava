package com.Abe07.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *  打印流
 *
 *  java.io.PrintStream extends OutputStream
 *       PrintStream为其它输出流添加了功能，即能够方便地打印各种数据值的表示。
 *
 *  子类通用方法
 *     - public void close(): 关闭此输出流并释放与此流相关联的任何系统资源
 *     - public void flush(): 刷新输出流并强制任何缓冲的输出字节被写出
 *     - public void write(byte[] b): 将 b.length 字节从指定的字节数组写入此输出流
 *     - public void write(byte[] b, int off, int len): 从指定的字节数组接入 len 字节，从偏移量 off 开始输出到此输出流
 *     - public abstract void write(int b): 将指定字节写入此输出流
 *  注意：
 *      若使用继承自父类的 write 方法写如数，那么查看数据的时候会查询编码表（97 -> a）
 *      若使用自己特有的方法 print/println 方法写数据，写的数据会原样输出（97 -> 97）
 *
 *  PrintStream 的特点：
 *      1.只负责数据的输出，不负责数据的读取
 *      2.与其它数据流不同，PrintStream 永远不抛出 IOException
 *      3.有特有的方法：print、println
 *          - void print(任意类型的值)
 *          - void println(任意类型的值)
 *
 *  构造方法：
 *      PrintStream(File file): 输出目的地时一个文件
 *          使用指定的文件创建一个新的打印流，而不需要自动换行。
 *      PrintStream(OutputStream out): 输出目的地是一个 FileOutputStream 对象
 *          创建一个新的打印流。
 *      PrintStream(String fileName): 输出的目的地是一个文件路径
 *          使用指定的文件名创建新的打印流，无需自动换行。
 */

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        // 1.创建 PrintStream 对象，构造方法中输入目的地对象
        PrintStream ps = new PrintStream("../print.txt");
        // 2.若使用继承自父类的 write 方法写如数，那么查看数据的时候会查询编码表（97 -> a）
        ps.write(97);
        // 2*.若使用自己特有的方法 print/println 方法写数据，写的数据会原样输出（97 -> 97）
        ps.println(97);
        ps.println(8.8);
        ps.println("HelloWorld");
        // 3.释放资源
        ps.close();
    }
}
