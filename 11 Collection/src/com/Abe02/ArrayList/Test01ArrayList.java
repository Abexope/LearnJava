package com.Abe02.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * ArrayList练习：生成6个1~33之间的随机数，添加到集合并遍历集合
 */


public class Test01ArrayList {
    public static void main(String[] args) {
        Random rg = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(rg.nextInt(33) + 1);
        }

        for (Integer integer : list)
            System.out.println(integer);
    }
}
