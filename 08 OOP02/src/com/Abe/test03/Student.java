package com.Abe.test03;


public class Student extends Person {   // Java中，继承的语法，使用extends关键字

    // properties
    private int id;     // 学号

    // setter & getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // methods
    public void study() {
        System.out.println(this.getName() + "在学习");
    }
}
