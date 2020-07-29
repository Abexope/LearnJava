package com.Abe.test03;

public class Person {

    int id;
    int age;
    String school;

    public Person() {
    }

    public Person(int id, int age, String school) {
        this.id = id;
        this.age = age;
        this.school = school;
    }

    public static void main(String[] args) {
        Person p = new Person(1, 20, "海淀");
    }

    public void setAge(int a){
        age=a;
    }

}
