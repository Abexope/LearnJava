package com.Abe.test03;

/**
 * 接口及其实现类
 *
 *      1.类是类，接口是接口，二者是同一层次的概念
 *      2.接口中没有构造器
 *      3.接口声明：interface
 *      4.在JDK1.8前，接口中只有两部分内容：
 *          （1）常量：固定修饰符：public static final
 *          （2）抽象方法：固定修饰符：public abstract
 */


public interface TestInterface01 {

    // 常量
    public static final int NUM = 10;

    // 抽象方法
    public abstract void a();
    public abstract void b(int num);
    public abstract int c(String name);
    // 灰色：默认修饰符，可以省略

}


interface TestInterface02 {

    // 常量
    public static final int NUM = 20;

    // 抽象方法
    void a();
    public abstract void e();
    public abstract void f(int num);

}


// 5.类和接口的关系：实现关系，类实现接口
// 6.一旦实现一个接口，那么实现类要重写接口中的全部抽象方法
class Student implements TestInterface01 {

    public void a() {

    }
    public void b(int num) {

    }
    public int c(String name) {
        return 0;
    }
}


// 7.如果没有全部重写抽象方法，那么这个类可以变成一个抽象类
abstract class Student2 implements TestInterface01 {

    public void a() {

    }
    //    public void b(int num) {      // OK
//
//    }
    public int c(String name) {
        return 0;
    }
}


// 8.Java只有单继承，但是Java可以有多实现
//      一个类继承其他类，只能继承一个父类
//      一个类实现接口的话，可以实现多个接口
class Student3 implements TestInterface01, TestInterface02 {

    @Override
    public void a() {

    }

    @Override
    public void b(int num) {

    }

    @Override
    public int c(String name) {
        return 0;
    }

    @Override
    public void e() {

    }

    @Override
    public void f(int num) {

    }
}


// 9.继承与实现的顺序：先继承，后实现
class Student4 extends Student2 implements TestInterface01, TestInterface02 {

    @Override
    public void a() {

    }

    @Override
    public void b(int num) {

    }

    @Override
    public int c(String name) {
        return 0;
    }

    @Override
    public void e() {

    }

    @Override
    public void f(int num) {

    }
}

