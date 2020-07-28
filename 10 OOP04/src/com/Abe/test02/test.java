package com.Abe.test02;

/**
 * 抽象类
 */


// 4.abstract修饰类，变成抽象类
// 5.一个抽象类中有0~n个抽象方法
abstract class Person {      // 抽象类，元类


    public Person() {       // 抽象类只有唯一的空构造器
    }

    // 1.在一个类中，会有一类方法，子类对这个方法非常满意，无需重写，直接使用
    public void eat() {
        System.out.println("eat");
    }

    // 2.在一个类中，会有一类方法，子类对这个方法永远不满意，必须重写，然后使用
    public abstract void say();     // 抽象方法
    // 3.abstract修饰方法，变成抽象方法

    public abstract void sleep();

}


// 6.抽象类可以被其他类继承
// 7.一个类继承一个抽象类，那么这个类可以变成抽象类
// 8.一般子类不加abstract修饰，一般会让子类重写父类中的抽象方法
// 9.子类继承抽象类，就必须重写全部的抽象方法
// 10.子类如果没有重写父类全部的抽象方法，那么子类也可以变成一个抽象类
class Student extends Person {

    @Override
    public void say() {
        System.out.println("啊啊啊啊啊啊");
    }

    @Override
    public void sleep() {
        System.out.println("哈哈哈哈哈哈");
    }

    @Override
    public void eat() {
        // “无需重写”的类也可以被重写
        super.eat();
        int a = 10;
        System.out.println(a);
    }
}


public class test {

    public static void main(String[] args) {
//        Person p = new Person();    // 11.异常，抽象类不能实例化对象
        Student s = new Student();
        s.sleep();
        s.say();
        s.eat();
    }

}
