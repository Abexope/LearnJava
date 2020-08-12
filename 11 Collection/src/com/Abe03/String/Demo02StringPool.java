package com.Abe03.String;

public class Demo02StringPool {
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = { 'a', 'b', 'c' };
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));
    }
}

