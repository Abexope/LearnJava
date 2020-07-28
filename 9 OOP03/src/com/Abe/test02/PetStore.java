package com.Abe.test02;

public class PetStore {
    // 宠物店类 [抽象工厂类] 工厂设计模式
    // 工厂的作用：负责根据输入的需求来实例化指定的对象

    public static Animal getAnimal(String pet_name) {   // 多态的应用

        // static修饰：方法直接保存在内存方法区中的静态域中，可以不通过实例化对象直接通过类调用
        Animal animal = null;

        if ("猫".equals(pet_name)) {      // "猫"放前面，避免空指针异常（如果传入的pet_name为null的话）
            animal = new Cat();
        }
        if ("狗".equals(pet_name)) {
            animal = new Dog();
        }
        if ("猪".equals(pet_name)) {
            animal = new Pig();
        }

        return animal;
    }

}
