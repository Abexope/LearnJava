package com.Abe.Recursion;

/**
 * 递归计算 1+2+ ... +n
 */
public class SumN {
    public static void main(String[] args) {
        System.out.println(sumN(100));
    }

    private static int sumN(int n) {
        if (n == 1) return 1;
        return n + sumN(n-1);
    }
}
