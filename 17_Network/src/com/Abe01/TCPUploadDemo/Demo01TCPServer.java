package com.Abe01.TCPUploadDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  TCP通信：服务器
 *      接收客户端的请求，读取客户端发送的数据，给客户端回写数据
 *
 *  表示服务器的类
 *      java.net.ServerSocket:
 *          这个类实现了服务器套接字。 服务器套接字等待通过网络进入的请求。
 *          它根据该请求执行一些操作，然后可能将结果返回给请求者。
 *
 *  构造方法
 *      - ServerSocket(int port): 创建绑定到指定端口的服务器套接字。
 *
 *  服务器必须明确一件事：必须清楚是哪个客户端请求的服务器
 *  所以可以使用 accept() 方法获取到请求的客户都对象 Socket
 *
 *  成员方法
 *      Socket accept(): 侦听要连接到此套接字并接受它。
 *
 *  实现步骤
 *      1.创建服务器 ServerSocket 对象和系统要指定的端口号
 *      2.使用 ServerSocket 对象中的 accept() 方法获取客户端的请求对象 Socket
 *      3.使用 Socket 对象中的 getInputStream() 方法获取网络字节输入流 InputStream 对象
 *      4.使用网络字节输入流 InputStream 对象的 read() 方法读取客户端发送的数据
 *      5.使用 Socket 对象中的 getOutputStream() 方法获取网络字节输出流 OutputStream 对象
 *      6.使用网络字节输出流 OutputStream() 对象中的 write() 方法，给客户端回写数据
 *      7.释放资源（Socket、ServerSocket）
 */

public class Demo01TCPServer {
    public static void main(String[] args) throws IOException {
        // 1.创建服务器 ServerSocket 对象和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            // 2.使用 ServerSocket 对象中的 accept() 方法获取客户端的请求对象 Socket
            Socket socket = server.accept();
            // 3. 使用 Socket 对象中的 getInputStream() 方法获取网络字节输入流 InputStream 对象
            InputStream is = socket.getInputStream();
            // 4.使用网络字节输入流 InputStream 对象的 read() 方法读取客户端发送的数据
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));
            // 5.使用 Socket 对象中的 getOutputStream() 方法获取网络字节输出流 OutputStream 对象
            OutputStream os = socket.getOutputStream();
            // 6.使用网络字节输出流 OutputStream() 对象中的 write() 方法，给客户端回写数据
            os.write("已收到你的请求".getBytes());
        }

        // 7.释放资源（Socket、ServerSocket）
//        server.close();
//        socket.close();
    }
}
