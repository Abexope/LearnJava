package com.Abe07.StringBuilder;

/**
 * StringBuilder类复习
 */


public class Demo03Review {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        // append() 方法
        stringBuilder.append(100).append(true).append("abc");   // 链式调用
        System.out.println(stringBuilder);

        // reverse() 方法，反转缓冲区中的内容
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        String s = stringBuilder.toString();    // 将缓冲区中的内容转化为字符串
        System.out.println(s);
    }
}
