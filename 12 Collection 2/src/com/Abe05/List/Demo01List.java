package com.Abe05.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List 接口 extends Collection 接口
 * List接口的特点：
 *      1.有序集合，存储有序
 *      2.有索引，具有与索引相关的方法
 *      3.允许出现重复元素
 * List接口中带有的索引方法
 *      - public void add(int index, E element)：在指定位置插入元素
 *      - public E get(int index)：获取指定位置的元素
 *      - public E remove(int index)：删除并返回指定位置的元素
 *      - public E set(int index, E element)；将指定位置的元素使用 element 替换
 * 注意索引不要越界
 *      索引越界异常：IndexOutOfBoundsException
 *      数组索引越界异常：ArrayIndexOutOfBoundsException
 *      字符串索引越界异常：StringIndexOutOfBoundsException
 *
 * 两个实现类：
 *      ArrayList：基于顺序表实现，查询快，增删慢
 *      LinkedList：基于连接表实现，查询慢，增删快
 */
public class Demo01List {
    public static void main(String[] args) {
        // 创建 List 对象
        List<String> list = new LinkedList<>();      // 多态
        list.add("a");
        list.add("B");
        list.add("c");
        list.add("a");
        System.out.println(list);

        // public void add(int index, E element)：在指定位置插入元素
        list.add(1, "Abe");
        System.out.println(list);

        // public E remove(int index)：删除并返回指定位置的元素
        list.remove(2);
        System.out.println(list);

        // public E set(int index, E element)；将指定位置的元素使用 element 替换
        list.set(0, "PI");
        System.out.println(list);

        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}
