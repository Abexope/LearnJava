package com.Abe02.Reference;

/**
 *  通过super引用成员方法
 */
public class Demo03SuperReference {
    public static void main(String[] args) {
        new Man().sayHello();
        new Man().superShow();
        new Man().show();
    }
}


interface Greetable {
    void greet();
}

class Human {
    public void sayHello() {
        System.out.println("Hello! I'm Human");
    }
}


class Man extends Human {
    public void sayHello() {
        System.out.println("Hello! I'm Man");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void superShow() {
        method(super::sayHello);        // 调用父类的 sayHello() 方法
    }

    public void show() {
        method(this::sayHello);         // 调用自己的 sayHello() 方法
    }
}
