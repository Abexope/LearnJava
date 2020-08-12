package com.Abe01.Collection;

import java.util.*;

/**
 * Collection接口的通用方法总结
 */


public class DemoCollectionReview {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<String> collection = new LinkedList<>();      // 多态式创建，
        // 可以使用 Collection下面的任意实现类执行以下方法

        collection.add("Hello");
        collection.add("World");
        collection.add("Abe");
        collection.add("Java");
        System.out.println(collection);

        // boolean remove(E e)：删除集合元素，成功删除返回true，否则返回false
        collection.remove("Hello");
        System.out.println(collection);

        // void clear()：清空集合，清空后集合对象依然存在，指示collection.size() == 0 collection.isEmpty() == true
//        collection.clear();
//        System.out.println(collection);

        // boolean contains(E e)：判断集合中是否包含某个元素
        System.out.println(collection.contains("a"));

        // boolean isEmpty()：集合判空
        System.out.println(collection.isEmpty());

        // int size()：返回集合容量
        System.out.println(collection.size());

        // 遍历集合
        for (String s : collection) {
            System.out.print(s + " ");
        }
    }
}
