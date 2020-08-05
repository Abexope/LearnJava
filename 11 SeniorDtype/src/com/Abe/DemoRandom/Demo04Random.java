package com.Abe.DemoRandom;

import java.util.Random;
import java.util.Scanner;

/**
 * 利用随机数模块编写猜数游戏
 */


public class Demo04Random {

    public static void main(String[] args) {
        Random r = new Random();                // 实例化随机数生成对象
        Scanner sc = new Scanner(System.in);

        int answer = r.nextInt(100);    // 生成一个 [0, 100) 之间的随机数
        /* 如果r.nextInt()中不带参数，则默认随机生成整个int类型取值范围内的随机数，即-21亿~21亿 */

        while (true) {
            System.out.print("请猜一个0~99之间的数字：");
            int num = sc.nextInt();
            if (num > answer) {
                System.out.println("猜大了");
            } else if (num < answer) {
                System.out.println("猜小了");
            } else {
                System.out.println("Bingo！结果就是：" + answer);
                break;
            }
        }
    }

}
