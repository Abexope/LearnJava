package com.Abe.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  反射
 *
 *  2.获取构造方法们
 *     Constructor<?>[] getConstructors()
 *     Constructor<T> getConstructor(类<?>... parameterTypes)
 *     Constructor<?>[] getDeclaredConstructors()
 *     Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 *
 *  Constructor 类
 *     T newInstance(Object... initargs)：使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
 *  Class 类
 *     T newInstance()：创建由此类对象表示的类的新实例。专门用于简化空参构造流程
 */
public class Demo02ReflectConstructor {

    /*
        2.获取构造方法们
           Constructor<?>[] getConstructors()
           Constructor<T> getConstructor(类<?>... parameterTypes)
           Constructor<?>[] getDeclaredConstructors()
           Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     */
    public static void main(String[] args) throws
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取 Person 的 Class 对象
        Class<Person> personClass = Person.class;

        // Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);  // 有参构造器
        System.out.println(constructor);
        // 创建对象
        Person p = constructor.newInstance("张三", 23);   // 有参实例化
        System.out.println(p);

        System.out.println("------------------------");

        constructor = personClass.getConstructor();     // 空参构造器
        p = constructor.newInstance();  // 空参实例化
        System.out.println(p);
        p = personClass.newInstance();  // 简化空参实例化
        System.out.println(p);
    }
}
