package com.Abe03.String;

public class Demo06StringConvert {
    public static void main(String[] args)
    {
        char[] chars = "Hello".toCharArray();
        byte[] bytes = "abc".getBytes();

        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
        System.out.println();
        for (byte aByte : bytes) {
            System.out.print(aByte + " ");
        }
        System.out.println();

        String str1 = "How to you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
    }
}
