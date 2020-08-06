package com.Abe02.ArrayList;

import java.util.ArrayList;

public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(3);
        System.out.println(list.get(1));
    }
}
