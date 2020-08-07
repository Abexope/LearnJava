package com.Abe03.String;

/**
 * 字符串练习：定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式参照如下：[word1#word2#word3]
 */


public class Test01StringConcat {

    private static String fromArrayToString(int[] arr)
    {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                str = str.concat("word" + arr[i] + "#");
            else {
                str = str.concat("word" + arr[i] + "]");
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(fromArrayToString(arr));
    }

}
