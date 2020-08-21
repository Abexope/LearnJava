package com.Abe04.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

/**
 *  字符缓冲输入流
 *
 *  java.io.BufferedReader extends Reader
 *      - int read()：读一个字符
 *      - int read(char[] cbuf)：将字符读入数组。
 *      - abstract void close()：关闭流并释放与之相关联的任何系统资源
 *
 *  构造方法：
 *      - BufferedReader(Reader in)：创建使用默认大小的输入缓冲区的缓冲字符输入流。
 *      - BufferedReader(Reader in, int sz)：创建使用指定大小的输入缓冲区的缓冲字符输入流。
 *      参数：
 *          Reader in: 字符输入流
 *              通过传递 BufferedReader 对象，缓冲流为 BufferedReader 对象增加一个缓冲区，提高 BufferedReader 的读取效率
 *
 *  特有的成员方法：
 *      - String readLine(): 读一行文字。
 *          自动适配不同操作系统的行终止符号
 *          返回值：包含行的内容的字符串，不包括任何行终止字符，如果已达到流的末尾，则为null
 *
 *  使用步骤：
 *      1.创建 BufferedReader 对象，构造方法中传递字符输入流
 *      2.使用 BufferedReader 的 read()/readline() 方法，读取文本
 *      3.释放资源
 */

public class Demo04BufferedReader {
    public static void main(String[] args) {
        // 1.创建 BufferedReader 对象，构造方法中传递字符输入流
        try(Reader fr = new FileReader("../prop.txt")) {
            // 2.使用 BufferedReader 的 read()/readline() 方法，读取文本
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
