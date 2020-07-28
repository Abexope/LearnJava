package com.Abe.test08;

/**
 * 重写 Object 类中的 toString() 方法
 */


public class Student {

    private String name;
    private int age;
    private double height;

    public Student() {
        super();
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 手写toString方法
//    public String toString() {  // 重写Object类中的toString()方法
//        // 权限定路径：包名 + 类名的完整表示
//        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + ": " +
//                this.getName() + "----" + this.getAge() + "---" + this.getHeight();
////        return this.name + "----" + this.age + "---" + this.height;
//    }

    // ALT+INSERT 自动生成重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

}

