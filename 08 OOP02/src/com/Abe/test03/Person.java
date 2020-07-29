package com.Abe.test03;

/**
 * 继承
 */


public class Person {

    // 属性
    private String name;
    private int age;
    private double height;

    // 构造器
    public Person() {}

    public Person(String name, int age, double height) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
    }

    // setter & getter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 方法
    public void eat() {
        System.out.println(this.getName() + "在吃饭");
    }

    public void sleep() {
        System.out.println(this.getName() + "在睡觉");
    }

}
