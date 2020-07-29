package com.Abe.test02;

/**
 * 为了提高代码的扩展性，符合面向对象的设计原则：开闭原则。
 * 开闭原则：指的就是扩展是 开放的，修改是关闭的。
 * 注意：多态可以提高扩展性，但是扩展性没有达到最好，以后我们会学习`反射`
 */

public class test {

    public static void main(String[] args) {

        Girl girl = new Girl();
//        Animal animal = new Dog();      // 父类引用指向子类对象
        Animal animal = PetStore.getAnimal("猫");
        Animal animal1 = PetStore.getAnimal("狗");

        // 多态
        girl.play(animal);
        girl.play(animal);
        girl.play(animal);
        girl.play(animal1);
        girl.play(animal1);
        girl.play(animal1);
    }

}
