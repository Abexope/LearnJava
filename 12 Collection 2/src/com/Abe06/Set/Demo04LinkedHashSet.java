package com.Abe06.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * java.util.LinkedHashSet extends HashSet
 * 特点：
 *      底层是 哈希表(数组+链表/红黑树) + 链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);

        LinkedHashSet<String> set1 = new LinkedHashSet<>();    // 使用 LinkedHashSet，保证读写顺序
        set1.add("www");
        set1.add("abc");
        set1.add("abc");
        set1.add("itcast");
        System.out.println(set1);
    }
}
