package com.Abe04.Landlords;

import java.util.ArrayList;
import java.util.Collections;

/**
    综合案例：斗地主

    1.准备牌：54张牌，储存到一个集合中
    特殊牌：大王、小王
    普通牌：
        定义一个数组/集合，储存4中花色：♥、♦、♠、♣
        定义一个数组/集合，储存13个序号：2、A、K ... 3
    嵌套循环遍历两个数组/集合，组装52张牌
        ♥2、♥A、♥K ...
        ♦2、♦A、♦K ...
        ♠2、♠A、♠K ...
        ♣2、♣A、♣K ...

    2.洗牌
        使用集合工具类 Collections 方法
        static void shuffle(List<?> list)：使用默认随机源对指定列表进行置换

    3.发牌
        要求：三人每人17张，剩余3张牌作为底牌，一人一张轮流发牌。索引技巧：(0~53) % 3
        定义4个集合，存储3个玩家的牌和底牌
        索引 >= 51 后，剩余的3张牌入底牌集合

    4.看牌
        直接打印集合，遍历存储玩家和底牌的集合

 */
public class Landlords {
    public static void main(String[] args) {
        // 1.准备牌
        // 定义一个存储 54 张牌的 ArrayList 集合，泛型使用 String
        ArrayList<String> pokers = new ArrayList<>();
        // 定义两个数组，一个数组存储牌的花色，一个存储牌的序号
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        // 先放大小王
        pokers.add("JOKER");
        pokers.add("joker");
        // 嵌套循环遍历两个数组组装52张牌
        for (String color : colors) {
            for (String number : numbers) {
                pokers.add(color + number);      // 把组装好的牌保存在集合中
            }
        }
        System.out.println("准备牌");
        System.out.println(pokers);
        System.out.println();

        // 2.洗牌
        // 使用 Collections 工具类
        // static void shuffle(List<?> list)
        Collections.shuffle(pokers);
        System.out.println("洗牌");
        System.out.println(pokers);
        System.out.println();

        // 3.发牌
        // 定义4个集合，3个保存玩家手牌，1个保存底牌
        ArrayList<String> player01 = new ArrayList<>();     // 玩家手牌
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> lastCards = new ArrayList<>();    // 底牌
        for (int i = 0; i < pokers.size(); i++) {
            if (i >= 51) {
                lastCards.add(pokers.get(i));
            } else {
                switch (i%3) {
                    case 0: player01.add(pokers.get(i)); break;
                    case 1: player02.add(pokers.get(i)); break;
                    case 2: player03.add(pokers.get(i)); break;
                }
            }
        }

        // 看牌
        System.out.print("玩家01的手牌：");
        System.out.println(player01);
        System.out.print("玩家02的手牌：");
        System.out.println(player02);
        System.out.print("玩家03的手牌：");
        System.out.println(player03);
        System.out.print("底牌：");
        System.out.println(lastCards);



    }
}
