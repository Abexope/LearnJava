package com.Abe08.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * java.util.LinkedHashMap<K, V> extends HashMap<K, V>
 * Map 接口的哈希表和链表实现，读写保序
 * 底层原理：
 *      哈希表 + 链表
 */

public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();                  // 读写不保序
        map.put(new Person("z赵四", 55), "北京");
        map.put(new Person("z张三", 18), "上海");
        map.put(new Person("l李四", 20), "广州");
        System.out.println(map);

        LinkedHashMap<Person, String> map2 = new LinkedHashMap<>();     // 读写保序
        map2.put(new Person("z赵四", 55), "北京");
        map2.put(new Person("z张三", 18), "上海");
        map2.put(new Person("l李四", 20), "广州");
        System.out.println(map2);
    }
}
