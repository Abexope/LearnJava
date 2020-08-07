package Polymorphism03;


public abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse() {
        // 子类特有方法
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("够吃SHIT");
    }
    public void watchHouse() {
        System.out.println("狗看家");
    }
}