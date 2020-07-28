package com.Abe.test05;


public class MsbStudent {

    //属性：
    String name;
    int age;
    static String school;       // 静态属性

    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        MsbStudent.school = "马士兵教育";
        //创建学生对象：
        MsbStudent s1 = new MsbStudent();
        s1.name = "张三";
        s1.age = 19;
        //s1.school = "马士兵教育";
        MsbStudent s2 = new MsbStudent();
        s2.name = "李四";
        s2.age = 21;
        //s2.school = "马士兵教育";
        System.out.println(s2.school);
        System.out.println(MsbStudent.school);
    }

}
