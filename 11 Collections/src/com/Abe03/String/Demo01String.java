package com.Abe03.String;

public class Demo01String {
    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String();     // 创建空字符串
        System.out.println("第1个字符串：" + str1);
        // 根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第2个字符串：" + str2);
        // 根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第3个字符串：" + str3);
        // 直接创建
        String str4 = "Hello";
        System.out.println(str4);
    }
}
