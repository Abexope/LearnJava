package com.Abe.test05;

/**
 * 权限修饰符的作用范围（1）
 *      private, default, protected, public
 */

public class A {
    // 同一个类下

    private int private_;           // private 修饰
    int default_;                   // default 修饰
    protected int protected_;       // protected 修饰
    public int public_;             // public 修饰

    public void eat() {
        System.out.println(this.private_);      // OK
        System.out.println(this.default_);      // OK
        System.out.println(this.protected_);    // OK
        System.out.println(this.public_);       // OK
    }
}
