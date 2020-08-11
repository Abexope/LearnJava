package com.Abe08.WrapperClass;

/**
    基本类型与字符串之间的相互转换

    基本数据类型 -> 字符串
        1) 最简单常用的：任数直接与空字符串相加，如 34 + ""
        2) 包装类中的静态方法：
            static String toString(int i)：返回一个表示指定整数的 String 对象
        3) String 类中的静态方法
            static String valueOf(int i)：返回 int 参数的字符串表示形式

    字符串 -> 基本数据类型
        使用包装类的静态方法 parseXX("字符串")
            Integer 类：public static int parseInt(String s)
            Double 类：public static double parseDouble(String s)
            ...
 */


public class Demo03IntToString {
    public static void main(String[] args) {
        // 基本数据类型 -> 字符串
        String s1 = 100+"";
        System.out.println(s1+200);

        String s2 = Integer.toString(100);
        System.out.println(s2+200);

        String s3 = String.valueOf(100);
        System.out.println(s3+200);

        // 字符串 -> 基本数据类型
        int i = Integer.parseInt("100");
        System.out.println(i+200);

        // int i2 = Integer.parseInt("a");     // java.lang.NumberFormatException "a" 数字格式化异常

    }
}
