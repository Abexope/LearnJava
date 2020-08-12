package com.Abe06.Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * Set集合不允许出现重复元素的原理
 *      1.哈希值对比
 *      2.内容对比
 *
 * HashSet存储自定义元素
 * set集合报错元素唯一：
 *      存储元素（String, Integer, ... Student, Person），必须重写 hashCode 方法和 equals 方法
 * 要求：
 *      同名同年龄的人，视为同一个人，只能存储一次
 * 通过重写 hashCode() 和 equals 方法实现
 */

public class Demo03HashSet {
    public static void main(String[] args) {
        HashSet<PersonHashCode> set = new HashSet<>();
        PersonHashCode p1 = new PersonHashCode("丽丽", 18);
        PersonHashCode p2 = new PersonHashCode("丽丽", 18);
        PersonHashCode p3 = new PersonHashCode("张伟", 19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}


class PersonHashCode {
    private String name;
    private int age;

    public PersonHashCode() { }

    public PersonHashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonHashCode)) return false;
        PersonHashCode that = (PersonHashCode) o;
        return getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "PersonHashCode{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}