package com.Abe01.TCPUploadDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  TCP通信：客户端
 *      向服务器发送连接请求，给服务器发送数据，读取服务器诙谐的数据
 *
 *  表示客户端的类
 *      java.net.Socket: 该类实现客户端套接字（也称为“套接字”）。 套接字是两台机器之间通讯的端点。
 *      什么是“套接字”?
 *          包含了IP地址和端口号的网络单位
 *
 *  构造方法
 *      - Socket(String host, int port): 创建流套接字并将其连接到指定主机上的指定端口号。
 *      参数：
 *          String host: 服务器主机名/服务器的IP地址
 *          int port: 服务器的端口号
 *
 *  成员方法
 *      - OutputStream getOutputStream()：返回此套接字的输出流。
 *      - InputStream getInputStream()：返回此套接字的输入流。
 *      - void close()：关闭此套接字。
 *
 *  实现步骤
 *      1.创建客户端对象 Socket，构造方法绑定服务器的IP地址和端口号
 *      2.使用 Socket 对象中的 getOutputStream() 方法获取网络字节输出流 OutputStream 对象
 *      3.使用 网络字节输出流 OutputStream 对象中的 write() 方法，给服务器发送数据
 *      4.使用 Socket 对象中的 getInputStream() 方法获取网络字节输入流 InputStream 对象
 *      5.使用网络字节输入流 InputStream 对象的 read() 方法，读取服务器回写的数据
 *      6.释放资源（Socket）
 *  注意：
 *      1.客户端和服务器端进行交互，必须使用 Socket 中提供的网络流，不能使用自己创建的流对象
 *      2.当创建客户端对象 Socket 时，就已经开始请求服务器，并与之进行TCP三次握手建立连接
 *          如果服务器没有启动，那么会抛出异常
 *          如果服务器已经启动，那么可以正常交互
 */

public class Demo01TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1.创建客户端对象 Socket，构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);


//        while (true) {

//            Thread.sleep(100);

            // 2.使用 Socket 对象中的 getOutputStream() 方法获取网络字节输出流 OutputStream 对象
            OutputStream os = socket.getOutputStream();
            // 3.使用 网络字节输出流 OutputStream 对象中的 write() 方法，给服务器发送数据
            os.write("你好服务器".getBytes());
            // 4.使用 Socket 对象中的 getInputStream() 方法获取网络字节输入流 InputStream 对象
            InputStream is = socket.getInputStream();
            // 5.使用网络字节输入流 InputStream 对象的 read() 方法，读取服务器回写的数据
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));


//        }
        // 6.释放资源（Socket）
//        socket.close();
    }
}
