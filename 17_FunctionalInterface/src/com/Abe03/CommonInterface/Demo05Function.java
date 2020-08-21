package com.Abe03.CommonInterface;

import java.util.function.Function;

/**
 *  java.util.function.Function<T,R> 接口
 *      用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称为后置条件。
 *
 *  抽象方法
 *      - R apply(T t): 根据类型T的参数获取类型R的结果。
 *      使用的场景例如：将 String 类型转换为 Integer 类型
 */

public class Demo05Function {
    public static void change(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s, Integer::parseInt);
    }
}


/**
 *  Function 接口中的 andThen() 方法
 *      方法组合操作
 *
 *  default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
 *      Objects.requireNonNull(after);
 *      return (T t) ‐> after.apply(apply(t));
 *  }
 *
 *  需求：
 *      将 String 类型的 "123" 转换为 Integer 类型，再将转换结果 +10
 */

class Demo05Function2 {
    public static int change(String s, Function<String, Integer> fun1, Function<Integer, Integer> fun2) {
        return fun1.andThen(fun2).apply(s);
    }

    public static void main(String[] args) {
        String s = "12";
        int res = change(s, Integer::parseInt, (num)->num+=10);
        System.out.println(res);
    }
}


/**
 *  请使用 Function 进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
 *      String str = "赵丽颖,20";
 *      1. 将字符串截取数字年龄部分，得到字符串；
 *      2. 将上一步的字符串转换成为int类型的数字；
 *      3. 将上一步的int数字累加100，得到结果int数字。
 */

class Demo05Function3 {
    public static int change(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        System.out.println(
                change(str, (s)->s.split(",")[1], Integer::parseInt, (s)->s+=100)
        );
    }

}