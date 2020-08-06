package com.Abe02.ArrayList;

import java.util.ArrayList;

public class Demo03ArrayListEach
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        boolean success = list.add("aaa");
        System.out.println(list);
        System.out.println("添加动作是否成功：" + success);

        list.add("bbb");
        list.add("c");
        list.add("4444444");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((String)list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println((String)list.get(i));
    }
}