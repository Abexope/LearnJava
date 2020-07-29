package com.Abe.test09;

public class test {

    public static void main(String[] args) {
        Phone p1 = new Phone("小米10Pro", 4399, 2020);
        Phone p2 = new Phone("小米10Pro", 4399, 2020);
        Phone p3 = p1;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        System.out.println("p1==p2: " + (p1==p2));      // 对于引用数据类型，`==`比较的是内存地址，因此一定返回false
        System.out.println("p1.equals(p2): " + p1.equals(p2));      // 比较对象内容是否相等，但是源码使用的还是`==`，所以结果仍然是false
        // 通过重载/重写equals()方法，达到属性值相互比较的目的

        System.out.println(p1.equals(new Object()));    // false
        System.out.println(p1.equals(p3));

    }

}
