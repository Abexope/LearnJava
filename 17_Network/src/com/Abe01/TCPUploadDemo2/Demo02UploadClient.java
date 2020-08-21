package com.Abe01.TCPUploadDemo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  TCP通信案例：文件上传客户端
 *      读取本地文件，上传到服务器，读取服务器回写的数据
 *
 *  明确：
 *      数据源：E:/labuladong的算法小抄.pdf
 *      目的地：服务器
 *
 *  实现步骤：
 *      1.创建一个本地字节输入流 FileInputStream 对象，构造方法传入数据源路径
 *      2.创建一个客户端对象 Socket，构造方法中传入IP地址和端口号
 *      3.使用 Socket 的 getOutputStream，获取网络字节输出流 OutputStream 对象
 *      4.使用本地字节输入流 FileInputStream 对象中的 read() 方法读取本地文件
 *      5.使用网络字节输出流 OutputStream 对象中的 write() 方法将文件上传到服务器
 *      6.使用 Socket 的 getInputStream，获取网络字节输入流 InputStream 对象
 *      7.使用网络字节输入流 InputStream 对象中的 read() 方法读取服务器回写的数据
 *      8.释放资源（FileInputStream、Socket）
 */

public class Demo02UploadClient {
    public static void main(String[] args) throws IOException {
        // 1.创建一个本地字节输入流 FileInputStream 对象，构造方法传入数据源路径
        InputStream localIS = new FileInputStream("E:/labuladong的算法小抄.pdf");
        // 2.创建一个客户端对象 Socket，构造方法中传入IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        // 3.使用 Socket 的 getOutputStream，获取网络字节输出流 OutputStream 对象
        OutputStream os = socket.getOutputStream();

        int len;
        byte[] bytes = new byte[16384];

        //  4.使用本地字节输入流 FileInputStream 对象中的 read() 方法读取本地文件
        System.out.println("正在上传文件");
        while((len = localIS.read(bytes)) != -1) {
            // 5.使用网络字节输出流 OutputStream 对象中的 write() 方法将文件上传到服务器
            os.write(bytes, 0, len);
        }
        System.out.println("上传完毕");

        /*
            解决服务器上传完毕后线程阻塞状态：上传完毕后，给服务器写一个结束标记
                - void shutdownOutput(): 禁用此 Socket 的输出流
                对于TCP Socket，任何以前写入的数据都将被发送，并且后跟TCP正常的连接终止序列
         */
        socket.shutdownOutput();


        // 6.使用 Socket 的 getInputStream，获取网络字节输入流 InputStream 对象
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            // 7.使用网络字节输入流 InputStream 对象中的 read() 方法读取服务器回写的数据
            System.out.println(new String(bytes, 0, len));
        }

        // 8.释放资源（FileInputStream、Socket）
        socket.close();
    }
}
