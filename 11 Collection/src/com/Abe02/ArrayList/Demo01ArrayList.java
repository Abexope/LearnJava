package com.Abe02.ArrayList;

import java.util.ArrayList;

public class Demo01ArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("zzz");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        for (String s : list)
            System.out.println(s);
    }
}
