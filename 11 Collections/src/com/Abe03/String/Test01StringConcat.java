package com.Abe03.String;

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
