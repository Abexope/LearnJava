package com.Abe.test07;

import static java.lang.Math.*;

/**
 * 静态导入
 * 可以直接导入到方法的级别
 * 静态导入的注意事项：
 *      A:方法必须是静态的
 *      B:如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。
 */


public class Test02 {

    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
        System.out.println(round(5.6));         // 走的是自定义round方法
        System.out.println(Math.round(5.6));        // 走的是Math的round方法
    }

    //在静态导入后，同一个类中有相同的方法的时候，会优先走自己定义的方法。
    public static int round(double a){
        return 1000;
    }

}
