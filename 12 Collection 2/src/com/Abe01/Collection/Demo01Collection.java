package com.Abe01.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 2, 4, 1);
        System.out.println(list);
        ArrayList<Integer> arr = new ArrayList<>(list);
        System.out.println(arr);
    }
}
