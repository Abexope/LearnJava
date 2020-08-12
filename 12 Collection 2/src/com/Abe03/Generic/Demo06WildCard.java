package com.Abe03.Generic;

import java.util.ArrayList;
import java.util.Collection;

/**
    通配符的高级使用：受限泛型

    泛型的上限限定：? extends E
        表示泛型只能被指定为 E 类型本身或其子类
    泛型的下限限定：? super E
        表示泛型只能被指定为 E 类型本身或其父类

 */
public class Demo06WildCard {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement1(list1);
        // getElement1(list2);     // 报错，String 不是 Number 的子类或本身
        getElement1(list3);
        // getElement1(list4);     // 报错，Object 不是 Number 的子类或本身

        // getElement2(list1);     // 报错，Integer 不是 Number 的父类或本身
        // getElement2(list2);     // 报错，String 不是 Number 的父类或本身
        getElement2(list3);
        getElement2(list4);

        /*
            类与类的继承关系
            Integer -> Number -> Object
            String -> Object
         */

    }

    public static void getElement1(Collection<? extends Number> arr) {}
    public static void getElement2(Collection<? super Number> arr) {}
}
