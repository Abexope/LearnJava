package com.Abe02.FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;

/**
 *  方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
 *  当需要通过一个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时,就可以调该方法获取。
 */

public class Demo04Comparator {
    // 定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator() {
        // 方法的返回值是一个接口，可以返回这个接口的匿名内部类
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照字符串降序排序
                return o2.length() - o1.length();
            }
        };*/

        // 方法的返回值是一个函数式接口，可以返回一个Lambda表达式
        /*return (String o1, String o2) -> {
            // 按照字符串降序排序
            return o2.length() - o1.length();
        };*/

        // 简化Lambda表达式
        return (o1, o2) -> o2.length()-o1.length();
    }

    public static void main(String[] args) {
        // 创建一个字符串数组
        String[] arr = {"aaa", "b", "cccc", "d"};
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
