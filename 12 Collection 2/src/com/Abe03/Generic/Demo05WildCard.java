package com.Abe03.Generic;

import java.util.ArrayList;

/**
    泛型的通配符：`?`
        ? 表示任意数据类型

    使用方式：
        不能创建对象使用
        只能作为方法的参数使用

 */
public class Demo05WildCard {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        list02.add("c");

        printArray(list01);
        printArray(list02);

        printArray2(list01);
        printArray2(list02);

    }

    private static void printArray(ArrayList<?> list) {
        // 使用`通配符`实现遍历任意类型的 ArrayList 对象
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    private static <E> void printArray2(ArrayList<E> list) {
        // 使用`泛型`实现遍历任意类型的 ArrayList 对象
        for (E e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
