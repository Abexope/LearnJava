package com.Abe.Reflect;

import java.lang.reflect.Field;

/**
 *  反射
 *
 *  Class对象功能
 *      获取功能：
 *
 *      1.获取成员变量们
 *          Field[] getFields()：获取所有 public 修饰的成员变量
 *          Field getField(String name): 获取指定名称的 public 成员变量
 *
 *          Field[] getDeclaredFields(): 不考虑访问权限修饰符，获取所有的成员变量
 *          Field getDeclareField(String name)：获取指定名称的成员变量
 *
 *      2.获取构造方法们
 *          Constructor<?>[] getConstructors()
 *          Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 *          Constructor<?>[] getDeclaredConstructors()
 *          Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 *
 *      3.获取成员方法们
 *          Method<?>[] getMethods()
 *          Method<T> getMethod(类<?>... parameterTypes)
 *
 *          Method<?>[] getDeclaredMethods()
 *          Method<T> getDeclaredMethod(类<?>... parameterTypes)
 *
 *      4.获取类名
 *          String getName()
 *
 */
public class Demo01ReflectField {

    /*
        1.获取成员变量们
            Field[] getFields()
            Field getField(String name)
            Field[] getDeclaredFields()
            Field getDeclareField(String name)
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 获取 Person 的 Class 对象
        Class<Person> personClass = Person.class;

        // Field[] getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("------------------------");

        // Field getField(String name)
        Field a = personClass.getField("a");
        System.out.println(a);

        // 获取成员变量 a 的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);

        // 设置 a 的值
        a.set(p, "张三");
        System.out.println(p);

        System.out.println("------------------------");

        // Field[] getDeclaredFields()
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        // Field getDeclareField(String name)
        Field d = personClass.getDeclaredField("name");
        // 忽略访问权限修饰符的安全检查：暴力反射
        d.setAccessible(true);
        System.out.println(d.get(p));
    }
}
