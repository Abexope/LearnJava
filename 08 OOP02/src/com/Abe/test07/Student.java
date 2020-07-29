package com.Abe.test07;

/**
 * super关键字
 *      指向上一级父类的指针
 */


public class Student extends Person {

    double score;

    public Student() {
        super();    // 隐藏的父类构造器
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {

        super(name, age);           // 此写法必须放在第一行
        this.score = score;
//        this(score);
//        super.name = name;      // 也行
//        super.age = age;        // 也行
//        this.score = score;
//        this(score);          // 此写法必须放在第一行，显然，这与super的要求冲突，也就是说，两者必舍其一
        // 通常，调用super构造器，然后，子类属性使用this修饰符，即：super构造器 + this修饰符
        // 而不是 this构造器 + super修饰符
    }

}
