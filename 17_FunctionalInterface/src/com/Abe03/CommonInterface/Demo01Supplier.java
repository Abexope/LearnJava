package com.Abe03.CommonInterface;

import java.util.function.Supplier;

/**
 *  Supplier<T> 接口
 *      生产型接口，指定的接口的泛型是什么类型，接口中的 get() 方法就会产生什么类型的数据
 *
 *  java.util.function.Supplier<T> 接口仅包含一个无参的方法： T get()。用来获取一个泛型参数指定类型的对象数据。
 *  由于这是一个函数式接口，这也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象数据
 */
public class Demo01Supplier {
    // 定义一个方法，方法传的参数传递 Supplier<T> 接口，泛型指定为 String，get() 方法就会返回一个 String
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 调用 getString 方法，方法的参数 Supplier 是一个函数式接口，所以可以传递 Lambda 表达式
        String s = getString(()->{
           // 生产一个字符串并返回
           return "胡歌";
        });
        System.out.println(s);

        // 简化 Lambda
        System.out.println(getString(() -> "虎哥"));
    }
}



/**
 *  Supplier练习：求数组元素的最大值
 *      使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
 *      提示：接口的泛型请使用java.lang.Integer 类。
 */

class Demo01Supplier2 {
    // 定义一个方法，用于获取 int 类型数组中元素的最大值，方法的参数传递 Supplier 接口，泛型使用 Integer
    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        // 定义一个 int 类型数组，并赋值
        int[] arr = {100, 0, -50, 88, 99, 33, -30};
        // 调用 getMax 方法，方法的参数 Supplier 是一个接口，可以传递 Lambda 表达式
        int maxVal = getMax(() -> {
            // 获取数组中的最大值并返回
            int maxNum = arr[0];
            for (int i : arr) {
                maxNum = Math.max(i, maxNum);
            }
            return maxNum;
        });
        System.out.println(maxVal);
    }
}
