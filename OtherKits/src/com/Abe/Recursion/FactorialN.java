package com.Abe.Recursion;

/**
 * 递归求阶乘
 */

public class FactorialN {
    public static void main(String[] args) {
        System.out.println(factorial(20L));
    }
    private static long factorial(long n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
}
