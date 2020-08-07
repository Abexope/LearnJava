package com.Abe02.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * ArrayList练习：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
 *      要求：使用自定义方法实现筛选
 */


public class Test04ArrayList {
    public static void main(String[] args)
    {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println("原始大集合: " + list);

        ArrayList<Integer> evenList = getSmallList(list);
        System.out.println("小集合: " + evenList);
    }

    private static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList)
    {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (Integer integer : bigList) {
            if (integer % 2 == 0) {
                smallList.add(integer);
            }
        }
        return smallList;
    }
}
