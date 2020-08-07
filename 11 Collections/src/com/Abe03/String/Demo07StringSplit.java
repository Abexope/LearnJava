package com.Abe03.String;

public class Demo07StringSplit {
    public static void main(String[] args)
    {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (String s : array1) {
            System.out.println(s);
        }

        String str2 = "aaa.bbb.ccc";
        String[] array2 = str2.split("\\.");    // 转义反斜和句点

        for (String s1 : array2) {
            System.out.println(s1);
        }
    }
}
