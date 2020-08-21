package com.Abe01.File;

import java.io.File;
import java.io.IOException;

/**
 * 创建删除功能
 *      - public boolean createNewFile(): 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件夹
 *      - public boolean delete(): 删除此File类表示的文件或目录
 *      - public boolean mkdir(): 创建由此File类表示的目录
 *      - public boolean mkdirs(): 创建由此File类表示的目录，包括必须但不存在的父目录
 */

public class Demo04Mkdirs {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Administrator\\Desktop\\test.txt";
        File f1 = new File(filePath);
        if (f1.createNewFile()) {
            System.out.println("创建成功");
        } else {
            System.out.println("文件已存在");
        }

        String dirPath = "C:\\Users\\Administrator\\Desktop\\test";
        File f2 = new File(dirPath);
        boolean b2 = f2.mkdirs();
        System.out.println(b2);

        String subDirPath = "\\Desktop\\test2";
        File f3 = new File(subDirPath);
        boolean b3 = f3.mkdirs();
        System.out.println(b3);
        System.out.println(f3.getAbsolutePath());

    }
}
