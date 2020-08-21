package com.Abe06.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  练习：序列化集合
 *      当我们想在文件中保存多个对象的时候，可以将多个对象储存到一个集合中，对集合对象做序列化和反序列化
 *
 *  分析：
 *      1.创建一个存储对象的集合
 *      2.向集合中存储对象
 *      3.创建一个 ObjectOutputStream 对象
 *      4.使用 ObjectOutputStream 对象的 writeObject() 方法序列化集合对象
 *      5.创建一个 ObjectInputStream 对象
 *      6.使用 ObjectInputStream 对象的 readObject() 方法反序列化集合对象
 *      7.将 Object 类型对象转化成 目标集合对象
 *      8.遍历集合
 *      9.释放资源
 */

public class TestSerializeSet {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Person> people = new ArrayList<>();
        Collections.addAll(people, new Person("迪丽热巴", 22),
                new Person("古力娜扎", 19), new Person("谢广坤", 52));
        System.out.println("原始集合：" + people);

        // 序列化集合
        try (FileOutputStream fos = new FileOutputStream("../people.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(10);   // 线程等待

        // 反序列化集合
        try (FileInputStream fis = new FileInputStream("../people.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object o = ois.readObject();
            ArrayList<Person> p = (ArrayList<Person>) o;
            for (Person person : p) {
                System.out.println(person);
            }

            System.out.println("反序列化集合：" + p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
