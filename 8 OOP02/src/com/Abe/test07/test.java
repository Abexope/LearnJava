package com.Abe.test07;

public class test {

    public static void printStudent(Student s) {
        System.out.println(s.name + "----" + s.age + "----" + s.score);
    }

    public static void main(String[] args) {
        Student s = new Student("张三", 22, 100);
        printStudent(s);
        System.out.println(s);      // 打印对象的默认结果：[包名]+[类名]+@[内存地址的16进制哈希值]
    }

}
