package com.Abe.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *  反射
 *
 *  3.获取成员方法们
 *     Method<?>[] getMethods()
 *     Method<T> getMethod(类<?>... parameterTypes)
 *     Method<?>[] getDeclaredMethods()
 *     Method<T> getDeclaredMethod(类<?>... parameterTypes)
 *
 *  Object invoke(Object obj, Object... args): 在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
 */

public class Demo03ReflectMethod {
    /*
        3.获取成员方法们
        Method<?>[] getMethods()
        Method<T> getMethod(类<?>... parameterTypes)
        Method<?>[] getDeclaredMethods()
        Method<T> getDeclaredMethod(类<?>... parameterTypes)
     */
    public static void main(String[] args) throws
            NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 获取 Person 的 Class 对象
        Class<Person> personClass = Person.class;

        // 获取指定名称的方法
        Method eatMethodNoParam = personClass.getMethod("eat");    // 无参数情况
        Method eatMethodHasParam = personClass.getMethod("eat", String.class);      // 有参数情况

        // 使用反射实例化对象，执行方法
        Person p = personClass.newInstance();
        eatMethodNoParam.invoke(p);
        eatMethodHasParam.invoke(p, "汉堡包");

        System.out.println("------------------------");

        // 获取所有 public 方法，包括父类方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            // method.setAccessible(true);     // Method支持暴力反射
            System.out.println(method.getName());
        }

        // 获取类名
        String personClassName = personClass.getName();
        System.out.println(personClassName);

    }
}
