package com.Abe.test02;

/**
 * 多态
 */


public abstract class Animal {
    // 抽象元类模板
    public abstract void shout();
}


class Cat extends Animal {
    // 实际需要实例化的子类

    public void shout() {
        // 子类中必须要重写模板方法
        System.out.println("喵喵喵~~~");
    }

    public void scratch() {
        System.out.println("猫爪挠——咔咔咔~~~");
    }

}


class Dog extends Animal {

    public void shout() {
        System.out.println("汪汪汪~~~");
    }

    public void guard() {
        System.out.println("看门护院");
    }

}


class Pig extends Animal {

    public void shout() {
        System.out.println("haah---");
    }

    public void eat() {
        System.out.println("吃吃吃");
    }

}
