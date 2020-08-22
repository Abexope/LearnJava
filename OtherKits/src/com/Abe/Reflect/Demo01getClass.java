package com.Abe.Reflect;

public class Demo01getClass {
    /*
        获取Class对象的方式：
            1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
            2. 类名.class：通过类名的属性class获取
            3. 对象.getClass()：getClass() 方法在Object类中定义
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
        Class<?> cls1 = Class.forName("com.Abe.Reflect.Person");
        System.out.println(cls1);

        // 2. 类名.class：通过类名的属性class获取
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        // 3. 对象.getClass()：getClass() 方法在Object类中定义
        Person person = new Person();
        Class<? extends Person> cls3 = person.getClass();
        System.out.println(cls3);

        // 使用 == 比较三个对象
        System.out.println(cls1 == cls2);   // true
        System.out.println(cls1 == cls3);   // true
        //
    }
}
