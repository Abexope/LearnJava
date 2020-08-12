package com.Abe03.String;


public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));      // IDEA自动识别为true
        System.out.println(str2.equals(str3));      // 也是true，但是IDEA并没有自动识别出来
        System.out.println(str1.equals("Hello"));   // IDEA自动识别为true
        System.out.println("Hello".equals(str1));   // IDEA自动识别为true
        /*
        以上佐证：只要是实例化在常量池中的字符串对象，
            只要字符串内容相同，那么它们的引用变量一定有相同的内存地址
            反过来说：相同内容的字符串变量共享字符串常量池中的对象
        而str3是实例化在堆内存中的，其地址与其它字符串对象不同，所以需要通过值比较才能确定
            值比较就是一一比较两个字符串对象所指向的字符编码数组
        */
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));      // false
        System.out.println(strA.equalsIgnoreCase(strB));    // true
    }
}