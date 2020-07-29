package com.Abe.test06;

/**
 * 权限修饰符的作用范围（2）
 */

import com.Abe.test05.A;


public class B extends A {
    // 不同包的继承类下

    public void a() {
//        System.out.println(this.private_);      // Not Allowed
//        System.out.println(this.default_);      // 出了同一个包，default变量也不能被直接访问了
        System.out.println(this.protected_);    // OK
        System.out.println(this.public_);       // OK
    }

}

class C {
    // 不同包、无继承的无关类下

    public void c() {
        A aa = new A();
//        System.out.println(aa.private_);        // Not Allowed
//        System.out.println(aa.default_);        // Not Allowed
//        System.out.println(aa.protected_);      // 没有了对继承关系，protected变量也不能被直接访问了
        System.out.println(aa.public_);         // OK

        B bb = new B();
//        System.out.println(bb.private_);        // Not Allowed
//        System.out.println(bb.default_);        // Not Allowed
//        System.out.println(bb.protected_);      // 没有了对继承关系，protected变量也不能被直接访问了
        System.out.println(bb.public_);         // OK
    }

}