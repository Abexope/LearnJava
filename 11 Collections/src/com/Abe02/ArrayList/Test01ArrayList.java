package com.Abe02.ArrayList;

import java.util.ArrayList;
import java.util.Random;

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
