package com.Abe05.List;

import java.util.LinkedList;

/**
 * java.util.LinkedList 集合 implements List 接口
 * LinkedList 集合特点：
 *      1.底层采用链表实现，查询慢、增删快
 *      2.内部包含大量操作首尾元素的方法
 *      注意：使用 LinkedList 集合的特有方法时，不能使用多态
 *
 *      - public void addFirst(E e): 将指定元素插入此列表的开头
 *      - public void addLast(E e): 将指定元素添加到此列表的结尾
 *      - public void push(E e): 将元素推入此列表所表示的堆栈，相当于 addFirst
 *
 *      - public E getFirst(E e): 获取首元素
 *      - public E getLast(E e): 获取尾元素
 *          注意元素访问异常：NoSuchElementException
 *
 *      - public E removeFirst(E e): 移除首元素并返回
 *      - public E removeLast(E e): 移除尾元素并返回
 *      - public E pop(): 从此列表表示的堆栈处弹出一个元素，相当于 removeFirst
 *
 *      - public boolean isEmpty(): 判断链表是否为空
 */


public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();


    }

    private static void show03() {
        /*
        - public E removeFirst(E e): 移除首元素并返回
        - public E removeLast(E e): 移除尾元素并返回
        - public E pop(): 从此列表表示的堆栈处弹出一个元素
         */
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        if (!linked.isEmpty()) {
            linked.removeFirst();
        }
        System.out.println(linked);
        if (!linked.isEmpty()) {
            linked.removeLast();
        }
        System.out.println(linked);
    }

    private static void show02() {
        /*
        - public E getFirst(E e): 返回首元素
        - public E getLast(E e): 返回尾元素
         */
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        if (!linked.isEmpty()) {
            System.out.println(linked.getFirst());
            System.out.println(linked.getLast());
        }
    }

    private static void show01() {
        /*
        - public void addFirst(E e): 将指定元素插入此列表的开头
        - public void addLast(E e): 将指定元素添加到此列表的结尾
        - public void push(E e): 将元素推入此列表所表示的堆栈
         */
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.addFirst("www");
        System.out.println(linked);

        linked.addLast(".com");
        System.out.println(linked);
    }


}
