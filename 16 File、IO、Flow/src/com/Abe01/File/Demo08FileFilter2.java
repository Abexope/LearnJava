package com.Abe01.File;

import java.io.File;
import java.io.FileFilter;
import java.util.Objects;

/**
 * 高效的文件搜索2：使用匿名内部类实现文件过滤器
 *      使用递归实现遍历指定路径，使用文件过滤器筛选以.java为结尾的文件路径并打印
 */


public class Demo08FileFilter2 {
    private static int count = 0;

    public static void main(String[] args) {
        printPath(new File("D:\\LearnJava"));
        System.out.println(count);
    }

    private static void printPath(File f) {
        if (f.isFile()) {
            System.out.println(f.getAbsolutePath());
            count ++;
            return;
        }

//        File[] files = f.listFiles(new FileFilter() {   // 匿名内部类实现文件过滤器
//            @Override
//            public boolean accept(File pathname) {    // FileFilter接口只有一个方法，可以考虑使用Lambda表达式
//                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });

        // Lambda表达式
//        File[] files = f.listFiles((File pathname) -> {return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");});

        // 简化的 Lambda 表达式
        File[] files = f.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));

        for (File file : Objects.requireNonNull(files)) {   // 传递过滤器对象
            if (file.isDirectory())
                printPath(file);
            else {
                System.out.println(file.getAbsolutePath());
                count ++;
            }
        }
    }
}
