package com.Abe.test03;

public class test { // extends Object {  /*所有类都隐式地继承基类Object*/

    public static void printStudent(Student s) {
        System.out.println(s.getId() + "----" + s.getName() + "----" + s.getAge() + "----" + s.getHeight());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("feifei");
        s.setHeight(1.84);
        s.setId(1001);
        printStudent(s);
        s.study();
        s.eat();
        s.sleep();
    }

}
