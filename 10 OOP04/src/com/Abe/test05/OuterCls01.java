package com.Abe.test05;

/**
 * 内部类
 *      （1）成员内部类
 *      （2）局部内部类
 *
 *  1.类的组成：属性，方法，构造器，代码块（普通块、静态块、构造块、同步块），内部类
 *  2.在类 OuterCls 内部定义的类 InnerCls01/02/03称为内部类。内部类：01/02/03   [相对地]外部类：OuterCls
 *  3.内部类中可以包含：属性、方法、构造器、甚至是一个内部类
 *  4.可以用到的修饰符：private, default, protected, public, final, abstract
 */


/* 成员内部类示例 */
public class OuterCls01 {

    // properties
    int age = 10;               // 成员变量[外部]
    static int AGE = 65;        // 静态成员变量[外部]

    // 成员内部类
    class InnerCls {

        int age = 20;               // 成员变量[内部]
        // static int AGE = 80;     // 普通的成员内部类中不能再定义 static 成员
        String name = this.toString();

        public void inner() {
            // 5.内部类可以访问外部类的内容
            System.out.println("method inner in InnerCls");
            int age = 30;
            System.out.println(age);                        // 访问方法内的局部变量，30
            System.out.println(this.age);                   // 访问自身的成员变量，20
            System.out.println(OuterCls01.this.age);        // 访问外部类的成员变量，10
            System.out.println(OuterCls01.AGE);             // 访问外部类的静态成员变量，65
            OuterCls01.outerB();                            // 访问外部类的 static 方法
            /*【谨慎调用外部方法，一旦外部方法的定义中包含了内部方法的调用，则可能形成无限相互调用】*/
        }

        // public static void innerB() {}                   // 非静态成员内部类中不允许定义静态方法
    }

    // 静态成员内部类
    static class StaticInnerCls {

        int age = 20;               // 成员变量[内部]
        static int AGE = 70;        // 静态成员变量[内部]   OK
        String name = this.toString();

        public void innerA() {
            // 6.静态内部类中只能访问外部类中被static修饰的内容
            System.out.println("method innerA in StaticInnerCls");
            System.out.println(this.age);                   // 访问自身的成员变量
            System.out.println(StaticInnerCls.AGE);         // 访问自身的静态成员变量
            // System.out.println(OuterCls01.this.age);     // 静态内部类无法访问外部类的成员变量    NO！
            System.out.println(OuterCls01.AGE);             // 访问外部类的静态成员变量
            OuterCls01.outerB();
        }

        public static void innerB(){
            // 只能访问静态属性，无论内部的还是外部的
            System.out.println("static method innerB in StaticInnerCls");
            System.out.println(StaticInnerCls.AGE);
            System.out.println(OuterCls01.AGE);
        }

    }

    // methods
    public void outerA() {
        // 普通方法访问内部类
        System.out.println("Outer method A");
        {
            /* 普通块 */
            System.out.println("Normal block in Outer method A");
        }

        // 7.外部类想要访问内部类的东西，需要创建内部类的对象然后进行调用
        InnerCls innerCls = new InnerCls();     // 在外部类方法中实例化内部类对象
        System.out.println(innerCls.name);
        innerCls.inner();
        StaticInnerCls staticInnerCls = new StaticInnerCls();
        System.out.println(staticInnerCls.name);
        staticInnerCls.innerA();
    }

    public static void outerB() {
        /*
            将这个静态方法作为内部类调用外部类方法的示例和出口
            此方法只打印一段文字，不做任何事，更不会重新调用内部方法，避免无限套娃……
        */
        System.out.println("Outer static method B");
    }

    public static void outerC() {
        // 静态方法访问内部类

        // InnerCls innerCls = new InnerCls();     // 在外部类的静态方法不能实例化内部非静态类对象    NO！
        StaticInnerCls staticInnerCls = new StaticInnerCls();   // OK
        System.out.println(staticInnerCls.name);
        staticInnerCls.innerA();
        StaticInnerCls.innerB();    // 内部类直接执行内部静态方法
    }

    // constructor
    public OuterCls01() {}

    public OuterCls01(int age) {
        this.age = age;
    }

    public OuterCls01(int age, int AGE) {
        this.age = age;
        OuterCls01.AGE = AGE;
    }

    // static block
    static {
        System.out.println("Outer static block, to load firstly.");
    }

    // construct block
    {
        System.out.println("Outer construct block");
    }

}


class test01 {
    public static void main(String[] args) {

        // 外部类实例化
        OuterCls01 outerCls01 = new OuterCls01();
        outerCls01.outerA();        // 实例化对象执行方法 outerA()
        System.out.println("--------------------------------------------");
        OuterCls01.outerC();        // 外部类直接执行静态方法 outerC()
        System.out.println("--------------------------------------------");

        // 成员内部类的实例化
        OuterCls01.InnerCls innerCls = outerCls01.new InnerCls();

        // 静态成员内部类的实例化
        OuterCls01.StaticInnerCls staticInnerCls = new OuterCls01.StaticInnerCls();

        innerCls.inner();
        System.out.println("--------------------------------------------");
        staticInnerCls.innerA();
        OuterCls01.StaticInnerCls.innerB();     // 外部类.静态内部类.静态方法

    }
}
