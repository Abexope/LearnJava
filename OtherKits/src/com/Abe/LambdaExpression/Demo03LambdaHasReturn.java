package com.Abe.LambdaExpression;

import java.util.*;

/**
 * 练习：带有参数和返回值的Lambda表达式
 */

public class Demo03LambdaHasReturn {

    public static void main(String[] args) {
        Person[] arr = {
            new Person("柳岩", 38),
            new Person("迪丽热巴", 18),
            new Person("古丽娜扎", 19),
        };

        // 排序方式一：对象实现Comparable接口，重写compareTo方法
        Arrays.sort(arr);

        // 排序方式二：Arrays.sort()重载方法，传入对象数组和Comparator的匿名内部类
        Arrays.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 排序方式三：Arrays.sort()重载方法，传入对象数组和Comparator的Lambda表达式
        Arrays.sort(arr, (Person o1, Person o2) -> {return o1.getAge() - o2.getAge();});

        // 排序方式四：Comparator.comparingInt方法
        Arrays.sort(arr, Comparator.comparingInt(Person::getAge));


        System.out.println(Arrays.toString(arr));
    }

}


class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "com.Abe.LambdaExpression.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(Person o) {
        return getAge() - o.getAge();
    }
}