package com.Abe09.Landlords2;

import java.util.*;

/**
 * 综合案例：斗地主2
 *      将手牌排序
 */
public class Landlords2 {
    public static void main(String[] args) {
        // 1.准备牌
        HashMap<Integer, String> indexPokers = Pokers.indexPokers;
        ArrayList<Integer> indexKey = Pokers.indexKey;
//        System.out.println(indexPokers);
//        System.out.println(indexKey);

        // 2.洗牌
        Collections.shuffle(indexKey);
//        System.out.println(indexKey);

        // 3.发牌
        ArrayList<Integer> player01 = new ArrayList<>();     // 玩家手牌
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> lastCards = new ArrayList<>();    // 底牌

        for (int i = 0; i < indexKey.size(); i++) {
            if (i >= 51) {
                lastCards.add(indexKey.get(i));
            } else {
                switch (i%3) {
                    case 0: player01.add(indexKey.get(i)); break;
                    case 1: player02.add(indexKey.get(i)); break;
                    case 2: player03.add(indexKey.get(i)); break;
                }
            }
        }

        // 4.排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(lastCards);

        // 5.看牌
        ArrayList<String> player01Pokers = lookPoker(player01, indexPokers);
        ArrayList<String> player02Pokers = lookPoker(player02, indexPokers);
        ArrayList<String> player03Pokers = lookPoker(player03, indexPokers);
        ArrayList<String> lastCardPokers = lookPoker(lastCards, indexPokers);

        System.out.println("玩家1：" + player01Pokers);
        System.out.println("玩家2：" + player02Pokers);
        System.out.println("玩家3：" + player03Pokers);
        System.out.println("底牌：" + lastCardPokers);
    }

    public static ArrayList<String> lookPoker(ArrayList<Integer> indexes, HashMap<Integer, String> indexPokers) {
        ArrayList<String> pokers = new ArrayList<>();
        for (Integer index : indexes) {
            pokers.add(indexPokers.get(index));
        }
        return pokers;
    }
}


class Pokers {  // 准备牌

    public static HashMap<Integer, String> indexPokers = new HashMap<>();
    public static ArrayList<Integer> indexKey = new ArrayList<>();

    static {
        // 初始花色和数字
        ArrayList<String> colors = new ArrayList<>();   // 花色
        ArrayList<String> numbers = new ArrayList<>();  // 数字
        Collections.addAll(colors, "♥", "♦", "♠", "♣");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        // 扑克牌数组
        ArrayList<String> pokers = new ArrayList<>();
        pokers.add("JOKER");    // 大王
        pokers.add("joker");    // 小王
        for (String number : numbers) {
            for (String color : colors) {
                pokers.add(color + number);
            }
        }

        // 创建 key, value 对
        for (int i = 0; i < pokers.size(); i++) {
            indexPokers.put(i, pokers.get(i));
            indexKey.add(i);
        }


    }
}
