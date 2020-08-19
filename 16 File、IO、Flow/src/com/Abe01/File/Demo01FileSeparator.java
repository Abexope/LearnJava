package com.Abe01.File;

import java.io.File;

/**
 * File类
 *
 * java.io.File类
 *      文件和目录路径名的抽象表示形式
 *      Java将计算机中的文件/文件夹/路径封装成File类，通过File类实现对文件/文件夹/路径的操作
 * File类中的常用方法
 *      创建文件/文件夹
 *      删除文件/文件夹
 *      获取文件/文件夹
 *      判断文件/文件夹是否存在
 *      遍历文件夹中的内容
 *      获取文件大小
 * File类与操作系统无关，任何操作系统均可使用此类中的方法
 *
 * 三个关键词：file、directory、path
 */

public class Demo01FileSeparator {
    public static void main(String[] args) {
        /*
            static String pathSeparator: 与系统有关的路径分隔符，字符串对象
            static char pathSeparatorChar: 与系统有关的路径分隔符，字符类型

            static String separator: 与系统有关的默认名称分隔符，字符串对象
            static char separatorChar: 与系统有关的默认名称分隔符，字符类型

            避免将路径写死，导致跨平台问题：
            Windows: C:\\develop\\a\\a.txt
            Linux: /develop/a/a.txt
            推荐方式："C:" + File.separator + "develop" + File.separator + "a" + File.separator + "a.txt"
         */
        String pathSeparator = File.pathSeparator;      // 多路径之间分隔符 Windows: 分号;    Linux: 冒号:
        System.out.println(pathSeparator);
        String separator = File.separator;      // 名称分隔符 Windows: 反斜 \      Linux: 正斜 /
        System.out.println(separator);
    }

}
