package com.Abe05.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *  字节转换输入流
 *
 *  java.io.InputStreamReader extends Reader
 *      InputStreamReader 是从字节流到字符流的桥：它读取字节，并使用指定的charset将其解码为字符
 *
 *  共性成员方法
 *      - int read(byte[] b)：从输入流读取一些字节数，并将它们存储到缓冲区 b
 *      - int read(byte[] b, int off, int len)：从输入流读取最多 len字节的数据到一个字节数组
 *      - void reset()：将此流重新定位到上次在此输入流上调用 mark方法时的位置
 *
 *  构造方法
 *      - InputStreamReader(InputStream in)：创建一个使用默认字符集的InputStreamReader。
 *      - InputStreamReader(InputStream in, String charsetName)：创建一个使用命名字符集的InputStreamReader。
 *      参数：
 *          InputStream in：字节输入流，用来读取文件中保存的字节
 *          String charsetName：指定的编码表，不区分大小写，如'GBK'，'gbk'，……
 *
 *  使用步骤：
 *      1.创建 InputStreamReader 对象，构造方法中传递 FileInputStream 对象和指定的编码格式
 *      2.使用 InputStreamReader 对象的 read() 方法读取文件
 *      3.释放资源
 *  注意：
 *      构造方法中指定的编码要与文件的编码对应，否无法正确读取
 */
public class Demo02InputStreamReader {
    public static void main(String[] args) {
        readGBK();
    }

    /*
        使用 InputStreamReader 读取 GBK 格式的文件
     */
    private static void readGBK() {
        // 1.创建 InputStreamReader 对象，构造方法中传递 FileInputStream 对象和指定的编码格式
        try (FileInputStream fis = new FileInputStream("../gbk.txt")) {
            InputStreamReader isr = new InputStreamReader(fis, "GBK");
            // 2.使用 InputStreamReader 对象的 read() 方法读取文件
            int len;
            while ((len = isr.read()) != -1) {
                System.out.println((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        使用 InputStreamReader 读取 UTF-8 格式的文件
     */
    private static void readUTF8() {
        // 1.创建 InputStreamReader 对象，构造方法中传递 FileInputStream 对象和指定的编码格式
        try (FileInputStream fis = new FileInputStream("../utf8.txt")) {
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            // 2.使用 InputStreamReader 对象的 read() 方法读取文件
            int len;
            while ((len = isr.read()) != -1) {
                System.out.println((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
