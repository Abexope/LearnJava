package com.Abe03.String;

public class Demo04StringGet {
    public static void main(String[] args)
    {
        // 获取字符串长度
        int length = "asdfsajiefaslkjf".length();
        System.out.println(length);

        // 字符串拼接
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // 字符串索引
        System.out.println(str3.charAt(5));             // W

        // 获取目标子串首次出现的位置
        System.out.println(str3.indexOf("Wor"));        // 5
        System.out.println(str3.indexOf("abd"));        // -1
    }
}
