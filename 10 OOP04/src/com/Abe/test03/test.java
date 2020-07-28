package com.Abe.test03;

public class test {

    public static void main(String[] args) {

        // 10.接口不能直接创建对象
//        TestInterface01 t = new TestInterface01();        // 异常

        // 但是，声明接口变量可以指向实现类
        TestInterface01 t = new Student();      // OK
        Student t1 = new Student();             // OK
        // 可以利用接口实现多态[参考抽象类的多个不同的实现类]

        // 11.访问接口中的常量
        System.out.println(TestInterface01.NUM);    // 利用接口的静态属性访问
        System.out.println(Student.NUM);            // 利用实现类的静态属性访问
        System.out.println(t.NUM);                  // 利用该接口的实现类的实例化对象访问
        System.out.println(t1.NUM);

    }

}
