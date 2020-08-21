package com.Abe.Recursion;

import java.io.File;
import java.util.Objects;

/**
 * 递归打印文件路径
 */

public class PrintPath {
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
