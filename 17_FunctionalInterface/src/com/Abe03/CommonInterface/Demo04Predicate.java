package com.Abe03.CommonInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *  java.util.function.Predicate<T> 接口
 *  作用：对某种数据类型的值进行判断，结果返回一个 boolean 值
 *
 *  Predicate 接口的抽象方法
 *      - boolean test(T t): 用来对指定数据类型进行判断的方法
 *          结果：
 *              符合条件：返回 true
 *              不符合条件：返回 false
 */

public class Demo04Predicate {
    /*
        定义一个方法
        参数传递 String 对象
        传递一个 Predicate 接口，泛型使用 String
        使用 Predicate 接口的 test() 方法进行判定，并返回判断结果
     */
    public static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";

        boolean b = checkString(s, (String str)->{
            // 判断字符串的长度是否大于5
            return str.length() > 5;
        });
        System.out.println(b);

        b = checkString(s, (str)->str.length()>5);
        System.out.println(b);

    }
}


/**
 *  逻辑表达式：可以连接多个判断条件
 *  &&：与运算
 *  ||：或运算
 *  ！：非运算
 *
 *  需求：判断一个字符串
 *      1.字符串的长度是否 >5 ?
 *      2.字符串中是否包含 a ?
 *
 *  Predicate 接口中有一个 and() 方法，可以实现上述需求
 *      - default Predicate<T> and(Predicate<? super T> other) {
 *          Objects.requireNonNull(other);
 *          return (t) -> this.test(t) && other.test(t);
 *      }
 */

class Demo04Predicate2 {
    /*
        定义一个方法，方法传递 1个字符串，2个Predicate接口，一个判断长度，另一个判断包含a
     */
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) && pre2.test(s);
//        return pre1.and(pre2).test(s);      // 与运算
//        return pre1.or(pre2).test(s);       // 或运算
//        return pre1.negate().test(s);       // 非运算
        return pre1.or(pre2).negate().test(s);      // !(pre1 || pre2)
    }

    public static void main(String[] args) {
        String s = "abdeds";
        boolean b = checkString(s, (str)->{
            return str.length() > 5;
        }, (str)->{
            return str.contains("a");
        });
        System.out.println(b);

        b = checkString(s, (str)->str.length()>5, (str)->str.contains("a"));
        System.out.println(b);

    }
}


/**
 *  集合信息筛选
 *      过滤 String[] 对象 {"迪丽热巴,女", "赵丽颖,女", "马儿咋哈,男"}
 *      提取性别为女，名字长度 >3 的对象保存在 ArrayList 中
 */

class Demo04Predicate3 {

    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "赵丽颖,女", "马儿咋哈,男"};
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (checkString(s, (str)->str.split(",")[0].length()==4, (str)->str.split(",")[1].equals("女")))
                list.add(s);
        }
        System.out.println(list);
    }
}
