package com.Abe07.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 从外部传入自定义对象比较规则
 * - public static <T> void sort(List<T> list, Comparator<? super T>)：从外部传入排序规则进行排序
 *
 * Comparable 与 Comparator 的区别
 *      Comparable：自己（this）和别人（参数）比较，自己需要实现 Comparable 接口并重写 compareTo() 方法
 *      Comparator：指定第三方比较规则进行对象比较
 */

public class Demo03Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 7, 9, 4, 1, 3, 2, 5, 8);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {      // 匿名内部类
            // 重写比较规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;     // 升序
                /*return o2 - o1;     // 降序*/
            }
        });
        System.out.println(list);


        ArrayList<Person> listP = new ArrayList<>();
        Collections.addAll(listP,
                new Person("z赵四", 55),
                new Person("z张三", 20),
                new Person("l李四", 20),
                new Person("王五", 15),
                new Person("l刘能", 55)
        );
        System.out.println(listP);

        /*Collections.sort(listP, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();   // 按年龄属性升序
                *//*return o2.getAge() - o1.getAge();   // 按年龄属性降序*//*
            }
        });
        System.out.println(listP);*/

        Collections.sort(listP, new Comparator<Person>() {
            // 按照多个成员排序
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge() - o2.getAge();
                if (result==0) {    // 如果年龄相同时
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);   // 比较名字的首字符
                }
                return result;
            }
        });
        System.out.println(listP);
    }
}
