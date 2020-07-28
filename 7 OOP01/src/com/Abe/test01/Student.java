package com.Abe.test01;

public class Student {

    byte e;
    int c;      // 成员变量：在类中方法外，有初始值，不建议初始化
    short s;
    long num2;
    float f;
    double d;
    char ch;
    boolean bo;
    String name;

    public void study() {
        int num;        // 局部变量，无初始值
        {
            int a;      // 局部变量，一定要初始化后再使用
        }
        if (1==3) {
            int b;
        }
        System.out.println(c);
    }

    public void eat() {
        System.out.println(c);
        int num;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c);
        System.out.println(s.e);
        System.out.println(s.d);
        System.out.println(s.ch);
        System.out.println(s.s);
        System.out.println(s.bo);
        System.out.println(s.name);
        System.out.println(s.num2);
    }

}
