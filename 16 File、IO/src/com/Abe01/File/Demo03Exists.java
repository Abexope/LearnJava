package com.Abe01.File;

import java.io.File;

/**
 * File类判断相关方法
 *      - public boolean exists(): 此File类表示的文件或目录是否存在
 *      - public boolean isDirectory(): 此File类表示的路径是否为文件夹
 *      - public boolean isFile(): 此File类表示的路径是否为文件
 */
public class Demo03Exists {
    public static void main(String[] args) {
        File f1 = new File("E:\\笔记\\JavaSE\\Java后端开发.nyf");
        File f2 = new File("E:\\笔记\\JavaSE");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }
}
