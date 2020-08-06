package com.Abe03.String;

public class Demo04StringGet {
    public static void main(String[] args)
    {
        int length = "asdfsajiefaslkjf".length();
        System.out.println(length);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        System.out.println(str3.charAt(5));

        System.out.println(str3.indexOf("Wor"));
        System.out.println(str3.indexOf("abd"));
    }
}
