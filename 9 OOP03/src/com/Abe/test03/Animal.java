package com.Abe.test03;


public class Animal {
    // 抽象元类模板
    public void shout() {
        System.out.println("啊啊啊——");
    }
}


class Cat extends Animal {

    public void shout() {
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
