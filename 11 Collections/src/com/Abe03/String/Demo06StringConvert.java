package com.Abe03.String;

public class Demo06StringConvert {
    public static void main(String[] args)
    {
        // 转化成字符数组
        char[] chars = "Hello".toCharArray();
        byte[] bytes = "abc".getBytes();

        // 转化成字符编码数组
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
        System.out.println();
        for (byte aByte : bytes) {
            System.out.print(aByte + " ");
        }
        System.out.println();

        // 批量替换字符
        String str1 = "How to you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
    }
}
