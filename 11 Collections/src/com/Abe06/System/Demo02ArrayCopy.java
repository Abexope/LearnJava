package com.Abe06.System;

import java.util.Arrays;

/**
 * System.arraycopy：数组复制
 */


class Demo02ArrayCopy {
    public static void main(String[] args) {
        // arraycopy
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src, 1, dest, 2, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }
}
