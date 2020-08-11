package com.Abe07.StringBuilder;

/**
 * StringBuilder类中的成员方法：
 *      - public StringBuilder append(...)：添加任意类型的字符串形式，并返回当前对象自身，
 *      实际使用时不用设置返回值，参考python.list.append
 *          参数：可以是任意类型
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1 == bu2);     // true,两个对象地址相同
        bu1.append("def");
        bu1.append("000");
        System.out.println(bu1);
        System.out.println(bu2);
        bu2.append("+++").append("ccc");    // 链式编程
        System.out.println(bu1);
        System.out.println(bu2);
    }
}
