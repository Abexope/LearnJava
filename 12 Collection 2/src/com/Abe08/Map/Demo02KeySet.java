package com.Abe08.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历集合
 * 方法一：键找值
 *      - public Set<K> keySet(): 获取集合中所有的 key，保存在一个 Set 对象中
 * 实现步骤：
 *      1.使用 Map集合中得 keySet() 方法，提取所有的 key 到一个 Set 集合中
 *      2.遍历 Set 集合，获取 Map 中的 key
 *      3.通过 Map 中的方法 get(key) 找到 value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map);

//        Set<String> set = map.keySet();
//        for (String s : set) {
//            System.out.println(s + ": " + map.get(s));
//        }
        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }

    }
}
