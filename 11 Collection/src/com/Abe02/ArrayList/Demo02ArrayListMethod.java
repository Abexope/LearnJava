package com.Abe02.ArrayList;

import java.util.ArrayList;

public class Demo02ArrayListMethod
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
        System.out.println(list + " " + list.size());

        System.out.println((String)list.get(2));
        String remove = (String)list.remove(2);
        System.out.println(remove);
        System.out.println(list + " " + list.size());
    }
}
