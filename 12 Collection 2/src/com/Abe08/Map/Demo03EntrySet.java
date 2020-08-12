package com.Abe08.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 遍历集合
 * 方法二：利用 Entry 对象
 *
 * May.Entry<K, V>：在 Map 接口中有一个内部接口Entry
 *      作用：Map 集合一旦创建，就会在内部创建一个 Entry 对象，用来记键与值得对应关系
 *
 *      - public Set<Map.Entry<K, V>> entrySet(): 获取到 Map 集合中所有的键值对对象的集合（Set集合）
 *
 * Entry<K, V>对象常用方法：
 *      - public K getKey(): 获取键
 *      - public V getValue(): 获取值
 *
 * 实现步骤：
 *      1.使用 Map 集合中的 entrySet() 方法提取集合中所有的 Entry 对象，并保存在一个 Set 集合中
 *      2.遍历 Set 集合，获取每一个 Entry 对象
 *      3.使用 Entry 对象中的方法 getKey() 和 getValue() 获取键与值
 */

public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map);

        for (Map.Entry<String, Integer> stringIntegerEntry: map.entrySet()) {
//            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
            System.out.println(stringIntegerEntry);
        }
    }
}
