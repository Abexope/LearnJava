package com.Abe06.System;

import java.util.Arrays;

/**
 * System类复习
 */


public class Demo03Review {
    public static void main(String[] args) {
        // 获取系统时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);

        // arraycopy(int[] src, int srcIndex, int[] dest, int destIndex, int count) 数组复制
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.arraycopy(arr1, 0, arr2, 4, 4);
        System.out.println(Arrays.toString(arr2));
    }
}
