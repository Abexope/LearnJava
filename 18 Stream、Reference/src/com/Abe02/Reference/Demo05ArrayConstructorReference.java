package com.Abe02.Reference;

import java.util.Arrays;

/**
 *  数组构造器引用
 */

public class Demo05ArrayConstructorReference {
    public static int[] createArray(int len, ArrayBuilder ab) {
        return ab.buildArray(len);
    }

    public static void main(String[] args) {
        int[] arr = createArray(10, int[]::new);
        System.out.println(Arrays.toString(arr));
    }
}


@FunctionalInterface
interface ArrayBuilder {
    int[] buildArray(int len);
}