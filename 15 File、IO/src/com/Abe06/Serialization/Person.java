package com.Abe06.Serialization;

import java.io.Serializable;

public class Person implements Serializable {   // 序列化对象必须要实现 Serializable 接口
    /*
        类的序列化由实现java.io.Serializable接口的类启用。
        不实现此接口的类将不会使任何状态序列化或反序列化。
        可序列化类的所有子类型都是可序列化的。
        序列化接口没有方法或字段，仅用于标识可串行化的语义。
     */

    /* InvalidClassException异常与解决方法
        序列化运行时将每个可序列化的类与称为serialVersionUID的版本号相关联，
        该序列号在反序列化期间用于验证序列化对象的发送者和接收者是否已加载与该序列化兼容的对象的类。
        如果接收方加载了一个具有不同于相应发件人类的serialVersionUID的对象的类，则反序列化将导致InvalidClassException 。
        一个可序列化的类可以通过声明一个名为"serialVersionUID"的字段来显式地声明它自己的serialVersionUID，
        该字段必须是静态的，最终的，类型是long
     */

    private static final long serialVersionUID = 42L;   // 当指定序列化UID后，无论怎样修改类，都不影响序列化和反序列化过程

    private String name;
//    private transient int age;  // 使用 transient 修饰的成员变量不会被序列化，当对象被反序列化时被赋予默认值
    public int age;

    public Person() { }

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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
