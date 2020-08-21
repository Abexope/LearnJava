package com.Abe02.Reference;

/**
 *  对象构造器引用
 */

public class Demo04ConstructorReference {
    public static Person printName(String name, PersonBuilder pb) {
        return pb.buildPerson(name);
    }

    public static void main(String[] args) {
        System.out.println(printName("迪丽热巴", Person::new));
    }
}


class Person {
    private String name;

    public Person() { }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

// 定义创建Person对象的函数式接口
@FunctionalInterface
interface PersonBuilder {
    Person buildPerson(String name);
}