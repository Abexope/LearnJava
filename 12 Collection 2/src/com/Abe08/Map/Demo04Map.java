package com.Abe08.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HashMap 保存自定义类型
 * Map集合保证key是唯一的：
 *      作为 key 的元素，必须重写 hashCode() 方法和 equals() 方法，以保证 key 是唯一的
 */
public class Demo04Map {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        /*
        HashMap存储自定义类型的键值
            key：Person 类型
                Person 类必须重写 ashCode() 方法和 equals() 方法，以保证 key 是唯一的
                    (同名同年龄视为同一个人)
            value: String 类型
         */
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("z赵四", 55), "北京");
        map.put(new Person("z张三", 18), "上海");
        map.put(new Person("l李四", 20), "广州");
        map.put(new Person("l李四", 20), "江西");
        System.out.println(map);

        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void show01() {
        /*
        HashMap存储自定义类型的键值
            key：String类型
            value: Person 类型
                value可以重复(同名同年龄视为同一个人)
         */
        // 创建一个HashMap
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("z赵四", 55));
        map.put("上海", new Person("z张三", 18));
        map.put("广州", new Person("l李四", 20));
        System.out.println(map);

        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
    
}


class Person {

    private String name;
    private int age;

    public Person() { }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person that = (Person) o;
        return getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

}
