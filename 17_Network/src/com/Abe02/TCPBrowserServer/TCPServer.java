package com.Abe02.TCPBrowserServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  创建BS版本的TCP服务器
 *      浏览器作为客户端
 */


public class TCPServer {
    public static void main(String[] args) throws IOException {
        /*创建服务器实例*/
        // 创建一个服务器 ServerSocket 和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        // 使用 accept 方法获取到请求客户端对象（浏览器）
        Socket socket = server.accept();
        // 使用 Socket 的 getInputStream() 方法获取 InputStream
        InputStream is = socket.getInputStream();
        // 使用 InputStream 中的 read() 方法读取客户端的请求信息
        /*byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new java.lang.String(bytes, 0, len));
        }*/

        /*解析浏览器请求的html文件地址*/
        // 将 InputStream 转化位 BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // 把客户端请求的第一行读取出来
        String line = br.readLine();                // GET /17_Network/web/index.html HTTP/1.1
        // 将读取到的信息切割，只要中间部分
        String[] arr = line.split(" ");      // /17_Network/web/index.html
        // 把路径前面的“/”去掉
        String htmlPath = arr[1].substring(1);      // 17_Network/web/index.html

        /*向浏览器返回网页数据*/
        // 创建一个本地字节输入流，构造方法中传递要读取的html文件路径
        FileInputStream fis = new FileInputStream(htmlPath);
        // 使用 Socket 中的 getOutputStream() 方法获取网络字节输出流 OutputStream 对象
        OutputStream os = socket.getOutputStream();

        // 写入HTTP协议响应头【固定写法】
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行，否则浏览器不解析
        os.write("\r\n".getBytes());

        // 一读一写复制文件，将服务器读取的html文件回写到客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        // 释放资源
        fis.close();
        socket.close();
        server.close();
    }
}
