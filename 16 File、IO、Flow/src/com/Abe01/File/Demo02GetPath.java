package com.Abe01.File;

import java.io.File;

/**
 * File类获取功能的方法
 *      - public String getAbsolutePath(): 返回File对象的绝对路径名字符串
 *      - public String getPath(): 返回File对象的路径字符串
 *      - public String getName(): 返回File对象表示的文件/文件夹名
 *      - public long length(): 返回File对象表示的 文件/文件夹中内容 的大小（单位：字节）
 */
public class Demo02GetPath {
    public static void main(String[] args) {
        show04();
    }

    private static void show04() {
        /*
            public long length(): 返回File对象表示的文件长度
            获取的是构造方法指定的文件的大小，以字节为单位
            注意：
                文件夹没有大小概念，不能获取文件夹的大小
                如果构造方法中给出的路径不存在，那么length方法返回0
         */
        File f1 = new File("E:\\笔记\\JavaSE\\Java后端开发.nyf");
        System.out.println(f1.length());
        File f2 = new File("E:\\笔记\\JavaSE");
        System.out.println(f2.length());
    }

    private static void show03() {
        /*
            public String getName(): 返回File对象表示的文件/文件夹名
         */
        File f1 = new File("E:\\笔记\\JavaSE\\Java后端开发.nyf");
        System.out.println(f1.getName());
        File f2 = new File("E:\\笔记\\JavaSE");
        System.out.println(f2.getName());
        System.out.println(f1);
        System.out.println(f2);
    }

    private static void show02() {
        /*
            public String getPath(): 返回File对象的路径字符串
            区分绝对路径和相对路径
         */
        File f1 = new File("E:\\笔记\\JavaSE\\Java后端开发.nyf");
        String p1 = f1.getPath();
        System.out.println(p1);
        System.out.println(f1.toString());
        File f2 = new File("Java后端开发.nyf");
        String p2 = f2.getPath();
        System.out.println(p2);
        System.out.println(f2.toString());

    }

    private static void show01() {
        /*
            public String getAbsolutePath(): 返回File对象的绝对路径名字符串
            获取构造方法中传递的路径，无论是绝对路径还是相对路径，返回的的都是绝对路径
         */
        File f1 = new File("E:\\笔记\\JavaSE\\Java后端开发.nyf");
        String p1 = f1.getAbsolutePath();
        System.out.println(p1);
        File f2 = new File("Java后端开发.nyf");
        String p2 = f2.getAbsolutePath();
        System.out.println(p2);
    }
}
