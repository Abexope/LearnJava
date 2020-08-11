package com.Abe08.WrapperClass;

import java.util.ArrayList;

/**
    自动装箱与自动拆箱
        JDK1.5+： 基本类型的数据和对应的包装类之间可以自动相互转换
 */
public class Demo02AutoWrapper {
    public static void main(String[] args) {
        /*
            自动装箱：直接把 int 型变量赋值给包装类
            Integer in = 1; // 相当于 Integer in = new Integer();
         */
        Integer in = 1;

        /*
            自动拆箱：in 是包装类，无法直接参与运算，可以自动转换为基本类型的数据，再参与计算
            in + 2; 就相当于 in.intValue() + 2 = 3
            in = in + 2; 就相当于 in = new Integer(3) 自动装箱
         */
        in = in + 2;
        System.out.println(in);

        // ArrayList 集合无法直接存储整数，但是可以存储 Integer 包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);    // 自动装箱，相当于list.add(new Integer(3)); 自动实现 int -> Integer
        System.out.println(list);
        Integer a = list.get(0);    // 自动拆箱，相当于 list.get(0).intValue()  自动实现 Integer -> int
    }
}
