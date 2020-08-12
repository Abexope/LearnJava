package com.Abe07.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * java.util.Collections 工具类，对集合对象执行操作
 * 常用方法：
 *      - public static <T> boolean addAll(Collection<T> c, T... elements)：向集合中添加一些元素
 *      - public static void shuffle(List<?> List)：乱序
 *      - public static <T> void sort(List<T> list)：排序（默认规则）
 *      - public static <T> void sort(List<T> list, Comparator<? super T>)：从外部传入排序规则进行排序
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "a", "b", "c", "d", "e");      // 同时添加多个元素
        System.out.println(list);

        Collections.shuffle(list);      // 乱序
        System.out.println(list);

        Collections.sort(list);         // 排序
        System.out.println(list);
    }
}
