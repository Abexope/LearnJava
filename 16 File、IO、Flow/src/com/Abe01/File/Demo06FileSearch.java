package com.Abe01.File;

import java.io.File;
import java.util.Objects;

/**
 * 条件文件搜索：
 *      使用递归实现遍历指定路径，打印路径中以.java为结尾的文件路径
 */

public class Demo06FileSearch {
    private static int count = 0;

    public static void main(String[] args) {
        printPath(new File("D:\\LearnJava"));
        System.out.println(count);
    }
    private static void printPath(File f) {
        if (f.isFile() && f.getAbsolutePath().toLowerCase().endsWith(".java")) {
            System.out.println(f.getAbsolutePath());
            count ++;
            return;
        }
        for (File file : Objects.requireNonNull(f.listFiles())) {
            if (file.isDirectory())
                printPath(file);
            else if (file.getAbsolutePath().toLowerCase().endsWith(".java")) {
                System.out.println(file.getAbsolutePath());
                count ++;
            }
        }
    }
}
