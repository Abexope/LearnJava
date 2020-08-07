package com.Abe02.ArrayList;

import java.util.ArrayList;

/**
 * ArrayList练习：定义以指定格式打印集合的方法，将ArrayList类型作为参数，
 *      使用`{}`括起集合，使用`@`分割每个元素，
 *      格式参照`{元素@元素@元素}`
 */


public class Test03ArrayList {

    private static String printArrayList(ArrayList<String> arrayList) {
        String str = "{";
        for (int i = 0; i < arrayList.size(); i++) {
            if (i < arrayList.size()-1) {
                str += arrayList.get(i) + "@";
            } else {
                str += arrayList.get(i) + "}";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三丰");
        arrayList.add("宋远桥");
        arrayList.add("张无忌");
        arrayList.add("殷梨亭");
        System.out.println(printArrayList(arrayList));
    }

}
