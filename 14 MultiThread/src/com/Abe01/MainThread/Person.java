package com.Abe01.MainThread;

public class Person {

    private String name;

    public Person() { }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        // 循环20次
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName() + "-->" + i);
        }
    }
}
