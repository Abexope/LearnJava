package com.Abe.test05;


public class test {
    // 同一个包内
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.private_);     // 出了自己的类，private变量就不能被直接访问了
        System.out.println(a.default_);         // OK
        System.out.println(a.protected_);       // OK
        System.out.println(a.public_);          // OK
    }
}