package com.Abe06.System;

import java.util.Arrays;

/**
 * System.currentTimeMillis()：获取时间戳
 */


public class Demo01TimeMillis {
    public static void main(String[] args) {
        // 练习：验证for循环打印数字1-9999所需要的时间（毫秒）
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end-start) + "毫秒");
    }
}


