package com.Abe.test02;

/**
 * 封装
 *      使用private修饰成员变量，使其无法直接从外部访问和修改
 *      通过对外提供接口，实现对成员变量的间接访问和修改
 */

public class Student {

    private int age;
    private String name;
    private String sex;

    // 构造器
    public Student() {}

    public Student(String name, int age, String sex){
        // 调用setter方法实现构造器
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            this.sex = "保密";
        }
    }

}
