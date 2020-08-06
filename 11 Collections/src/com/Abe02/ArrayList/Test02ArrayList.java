package com.Abe02.ArrayList;

import java.util.ArrayList;


public class Test02ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("赵丽颖", 18));
        list.add(new Student("唐嫣", 20));
        list.add(new Student("景甜", 25));
        list.add(new Student("柳岩", 19));
        for (Student student : list)
            System.out.println(student);
    }
}


class Student
{
    private String name;
    private int age;

    public Student() { }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        return "Student{name: '" + this.name + '\'' + ", age: " + this.age + '}';
    }
}
