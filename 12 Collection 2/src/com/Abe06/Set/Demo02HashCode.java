package com.Abe06.Set;

/**
 * 哈希值（hash code）
 * 哈希值是一个十进制整数，由系统随机给出，表示对象的`逻辑地址`。
 *      逻辑地址是一种模拟地址，注意与内存中的`物理地址`之间的区别
 * - int hashCode()：返回对象的哈希值
 *      public native int hashCode();
 *      native：表示调用本地操作系统的方法
 */

public class Demo02HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.hashCode());   // 获取对象的哈希值
        Person p2 = new Person();
        System.out.println(p2.hashCode());

        /*
        toString方法源码
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());    // 十六进制哈希值
            }
         */
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);     // false


        /*
        String类的哈希值
            String类重写Object类的hashCode方法
         */
        String s1 = new String("abd");
        String s2 = new String("abd");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());  // 在常量池中?
        System.out.println(s1 == s2);

        System.out.println("重地".hashCode());    // 1179395
        System.out.println("通话".hashCode());    // 1179395 哈希冲突

    }
}


class Person /*extends Object*/ {   // Object类中有 hashCode() 方法
    // Person类

//    @Override
//    public int hashCode() {
//        // 重写哈希值获取方法
//        return 0;
//    }
}