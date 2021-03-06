package com.Abe01.TCPUploadDemo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 *  TCP通信案例：文件上传服务端
 *      读取客户端上传的文件，保存到服务器的硬盘，给客户端回写“上传成功”
 *
 *  明确：
 *      数据源：客户端上传的问及那
 *      目的地：D:/upload/clientFile.pdf
 *
 *  实现步骤
 *      1.创建一个服务器 ServerSocket 对象，和系统要指定的端口号
 *      2.使用 ServerSocket 对象的 accept() 方法，获取到请求的客户端 Socket 对象
 *      3.使用 Socket 对象中的 getInputStream() 方法，获取到网络字节输入流 InputStream 对象
 *      4.判断 D:/upload 文件夹是否存在，不存在则创建一个
 *      5.创建一个本地的字节输出流 FileOutputStream 对象，构造方法中传入保存路径
 *      6.使用网络字节输入流 InputStream 对象中的 read() 方法读取客户端上传的文件
 *      7.使用本地字节输出流 FileOutputStream 对象中的 write() 方法，将读取到的文件保存到服务器硬盘中
 *      8.使用 Socket 对象中的 getOutputStream() 方法，获取到网络字节输出流 OutputStream 对象
 *      9.使用网络字节输入流 OutputStream 对象中的 write() 方法，给客户端回写 "上传成功"
 *      10.释放资源（FileOutputStream、Socket、ServerSocket）
 */

public class Demo02UploadServer {
    public static void main(String[] args) throws IOException {
        // 1.创建一个服务器 ServerSocket 对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);

        /*
            让服务器一直处于监听状态，采用死循环
            有一个客户端上传文件，就保存一个文件
         */
        while (true) {

            // 2.使用 ServerSocket 对象的 accept() 方法，获取到请求的客户端 Socket 对象
            Socket socket = server.accept();

            /*
                使用多线程提高效率：有一个客户端上传文件，就开启一个线程上传文件
                注意：线程run()方法没有抛出任何异常，所以内部抛出的所有异常都要用 try...catch 解决
             */
            new Thread(() -> {

                // 4.判断 D:/upload 文件夹是否存在，不存在则创建一个
                File file = new File("D:/upload");
                if (!file.exists()) {
                    System.out.println(file.mkdirs());
                }

                /*
                    自定义文件命名规则，防止文件名被覆盖掉
                    规则：域名+毫秒值+随机数
                 */
                String fileName = "Abe" + System.currentTimeMillis() + new Random().nextInt(999999) + ".pdf";

                try (
                        // 3.使用 Socket 对象中的 getInputStream() 方法，获取到网络字节输入流 InputStream 对象
                        InputStream is = socket.getInputStream();
                        // 5.创建一个本地的字节输出流 FileOutputStream 对象，构造方法中传入保存路径
                        // FileOutputStream localOS = new FileOutputStream(file + "/clientFile.pdf");   // 服务器本地输出流
                        FileOutputStream localOS = new FileOutputStream(file + "/" + fileName)
                        )
                {
                    int len;
                    byte[] bytes = new byte[16384];

                    // 6.使用网络字节输入流 InputStream 对象中的 read() 方法读取客户端上传的文件
                    System.out.println("正在保存客户端发来的文件");
                    while ((len = is.read(bytes)) != -1) {
                        // 7.使用本地字节输出流 FileOutputStream 对象中的 write() 方法，将读取到的文件保存到服务器硬盘中
                        localOS.write(bytes, 0, len);
                    }
                    System.out.println("保存完毕");

                    // 8.使用 Socket 对象中的 getOutputStream() 方法，获取到网络字节输出流 OutputStream 对象
                    OutputStream os = socket.getOutputStream();
                    // 9.使用网络字节输入流 OutputStream 对象中的 write() 方法，给客户端回写 "上传成功"
                    os.write("上传成功".getBytes());
                    socket.shutdownOutput();

                    // 释放资源（客户端 Socket、本地文件输出流对象 FileOutputStream）
//                    localOS.close();
//                    socket.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }).start();

        }

        // 10.释放资源（ServerSocket）
//        server.close();
    }
}
