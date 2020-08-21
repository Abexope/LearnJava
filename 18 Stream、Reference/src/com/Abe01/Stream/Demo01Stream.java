package com.Abe01.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 *  Stream流（JDK1.8+）
 *      关注做什么，而不是怎么做
 */
public class Demo01Stream {
    public static void main(String[] args) {
        /*传统循环处理集合案例
            遍历集合，提取符合以下条件的元素
            1. 首先筛选所有姓张的人；
            2. 然后筛选名字有三个字的人；
            3. 最后进行对结果进行打印输出。
        */
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        List<String> zhangList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                zhangList.add(name);
            }
        }

        List<String> shortList = new ArrayList<>();
        for (String name : zhangList) {
            if (name.length() == 3) {
                shortList.add(name);
            }
        }

        for (String name : shortList) {
            System.out.println(name);
        }
    }
}


class Demo01Stream2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        /*使用Stream流优化上面的流程*/
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
    }

}
