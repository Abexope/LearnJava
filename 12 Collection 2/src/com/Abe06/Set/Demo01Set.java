package com.Abe06.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * java.utils.Set接口 extends Collection 接口
 * Set 特点：
 *      1.不允许出现重复
 *      2.无索引，无法使用for循环遍历
 * java.util.HashSet集合 implements Set接口
 * HashSet 特点：
 *      1.不允许重复
 *      2.无索引，无法使用for循环遍历
 *      3.无序集合，读写不保序
 *      4.底层是一个哈希表结构
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);     // 不允许重复
        System.out.println(set);
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }

    }
}
