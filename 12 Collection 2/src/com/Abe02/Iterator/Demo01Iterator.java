package com.Abe02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
    java.util.Iterator接口：迭代器（遍历集合）
    常用方法：
        - boolean hasNext()：判断是否存在下一个元素
        - E next()：取出下一个元素
    Iterator是一个接口，无法直接使用，使用方式为：
        通过 Collection 接口中的 iterator() 方法来获取 Iterator 的实现类对象
        Iterator<E> iterator() 返回对应 collection 对象的元素迭代器

    使用迭代器
        1.使用 collection.iterator() 获取迭代器对象，使用 Iterator接口接收（多态）
        2.使用 hasNext() 方法判断是否可以继续迭代
        3.使用 next() 方法迭代 collection 对象

 */
public class Demo01Iterator {
    public static void main(String[] args) {
        // 创建结合对象
        Collection<String> collection = new ArrayList<>();
        collection.add("姚明");
        collection.add("麦迪");
        collection.add("科比");
        collection.add("詹姆斯");
        collection.add("艾佛森");
        System.out.println(collection);

        /*
         1.使用 collection.iterator() 获取迭代器对象，使用 Iterator接口接收（多态）
         Iterator<E> 接口支持泛型，泛型与对应结合相同
         使用next() 方法取出下一个元素时，一旦遇到无法取出的情况，JVM会抛出 java.util.NoSuchElementException 异常
         */
        Iterator<String> iter = collection.iterator();  // 多态
        while (iter.hasNext()){     // 迭代器套用while循环
            System.out.println(iter.next());
        }
        for(Iterator<String> it = collection.iterator(); it.hasNext();) {   // 迭代器套用for循环
            System.out.println(it.next());
        }
        for (String s : collection) {   // 增强for循环
            System.out.println(s);
        }
        System.out.println(collection);

    }
}
