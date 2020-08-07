package com.Abe03.String;

import java.util.Scanner;

/**
 * 字符串练习：键盘输入一个字符串，并且统计其中各种字符串的出现次数
 *      种类包括：大写字母、小写字母、数字、其它
 */

public class Test02StringCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入字符串：");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
            if (('A' <= ch) && (ch <= 'Z'))
                countUpper++;
            else if (('a' <= ch) && (ch <= 'z'))
                countLower++;
            else if (('0' <= ch) && (ch <= '9'))
                countNumber++;
            else {
                countOther++;
            }
        }
        System.out.println(countUpper);
        System.out.println(countLower);
        System.out.println(countNumber);
        System.out.println(countOther);
    }
}
