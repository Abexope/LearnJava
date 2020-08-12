package com.Abe07.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 自定义对象比较规则
 *      - public static <T> void sort(List<T> list)：排序（默认规则）
 *
 * Collections.sort() 方法的使用前提：
 *      被排序集合中的元素必须实现 Comparable 接口，并重写接口中的 compareTo() 方法，以此定义排序规则
 */

public class Demo02Comparable {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Collections.addAll(list,
                new Person("赵四", 55),
                new Person("张三", 18),
                new Person("李四", 20),
                new Person("王五", 15)
        );
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}


class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person() { }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
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

    @Override
    public int compareTo(Person o) {    // 实现 Comparable 接口，重写 compareTo() 方法
        // 重写排序规则
        /*return 0;   // 默认对象之间是相同的*/
        // 自定义比较规则：比较两人的年龄
        return this.getAge() - o.getAge();      // 升序排序，年龄小的排在前面
        /*return o.getAge() - this.getAge();      // 降序排序*/
    }
}