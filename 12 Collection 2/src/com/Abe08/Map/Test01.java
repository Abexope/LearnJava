package com.Abe08.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 练习：统计一个字符串中每个字符的出现次数
 *
 * 分析：
 *      1.使用 Scanner 获取输入字符串
 *      2.创建 Map 集合，key 是字符，value 是字符个数
 */

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组字符串");
        String str = sc.next();     // 用户输入字符串 abckdlajialkb
        HashMap<Character, Integer> map = new HashMap<>();      // 记录字典

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
