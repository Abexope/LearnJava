package com.Abe02.Iterator;

import java.util.ArrayList;

/**
    增强for循环(JDK1.5+)
        底层使用的也是迭代器，使用for循环格式，简化迭代器书写

    实现增强for循环的基础：Collection接口继承了 Iterable<E> 接口
        Collection<E> extends Iterable<E>：所有的单列集合都可以使用增强for循环
        public interface Iterable<T>：实现这个接口允许对象成为“foreach”语句的目标

    格式：
        for(集合/数组的数据类型 变量名: 集合名/数组名) {
            // 循环体 ...
        }
 }
 */
public class Demo02EnhanceFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
