package com.Abe.test02;


public class test {

    public static void printStudent(Student s) {
        System.out.println(s.getName() + "----" + s.getAge() + "----" + s.getSex());
    }

    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("nana");
        s1.setAge(19);
        s1.setSex(" ");
        printStudent(s1);

        Student s2 = new Student("feifei", 18, "男");
        printStudent(s2);
    }

}
