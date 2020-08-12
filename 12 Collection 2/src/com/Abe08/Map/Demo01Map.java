package com.Abe08.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<K, V>
 * Map集合的特点：
 *      1.双列集合，一个元素包含一组键值对 (key, value)
 *      2.key 和 value 的数据类型可以相同也可以不同
 *      3.key不允许重复，value可以重复
 *      4.key 与 value 一一对应
 *
 * java.util.HashMap<K, V>
 * HashMap特点：
 *      1.HashMap底层是哈希表+链表/红黑树（当哈希冲突元素超过8时）
 *      2.HashMap无序，不保证读写顺序
 *
 * java.util.LinkedHashMap<K, V>
 * LinkedHashMap特点：
 *      1.LinkedHashMap底层是哈希表+链表
 *      2.LinkedHashMap有序，读写保序
 *
 * Map集合常用方法
 *      - public V put(K key, V value): 向集合中添加键值对
 *      - public V remove(Object key): 移除 key 对应的键值对并返回
 *      - public V get(Object key): 获取 key 对应的 value 值
 *      - boolean containsKey(Object key): 判断 key 是否存在于集合中
 *
 *      - public Set<K> keySet(): 获取集合中所有的 key，保存在一个 Set 对象中
 *      - public EntrySet<Map.Entry<K, V>> entrySet(): 获取到 Map 集合中所有的键值对对象的集合（Set集合）
 */

public class Demo01Map {
    public static void main(String[] args) {
        show03get();
    }

    private static void show03get() {
        /*
        public V get(Object key): 获取 key 对应的 value 值
            key 存在，返回 value
            key 不存在，返回 null
         */

        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map);

        Integer v1 = map.get("杨颖");
        System.out.println("v1: " + v1);

        Integer v2 = map.get("aaa");
        System.out.println(v2);
    }

    private static void show02remove() {
        /*
        public V remove(Object key): 移除 key 对应的键值对并返回
            key 存在，返回被删除的值，
            key 不存在，返回 null
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map);

        Integer v1 = map.remove("林志玲");
        System.out.println("v1: " + v1);
        System.out.println(map);

        Integer v2 = map.remove("林志颖");
        System.out.println("v2: " + v2);

        System.out.println(map);
    }

    private static void show01put() {
        /*
        public V put(K key, V value): 向集合中添加键值对
            key 不存在则创建键值对，返回null
            key 存在则替换原来的value，返回被替换的value
         */
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("冷锋", "龙小云");
        System.out.println("v1: " + v1);

        String v2 = map.put("冷锋", "谢楠");
        System.out.println("v2: " + v2);

        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);
    }
}
