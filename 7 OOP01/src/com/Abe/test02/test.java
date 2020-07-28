package com.Abe.test02;


public class test {
    public static void main(String[] args) {

        /*
        创建对象的过程：
        1.第一次遇到Person的时候，进行类的加载，且只加载一次
        2.创建对象，为这个对象在堆中开辟空间
        3.为对象进行属性的初始化动作（JVM底层）

        new关键字实际上实在调用一个方法，这个方法叫构造方法（构造器）
        调用构造方法的时候，如果类中没有写构造器，那么系统会自动分配一个构造器，只是我们看不到罢了
        可以自己显示地编写构造器

        构造器格式：
        [修饰符] 构造器名 (形参列表) {构造器代码段}

        构造器和方法的区别：
        1.没有方法的返回值类型
        2.方法体内部不能有return语句
        3.构造器的名字很特殊，必须跟类名一样！

        构造器的作用：不是为了创建对象，因为在调用构造器之前，这个对象就已经创建好了，并且属性有默认的初始化值
        调用构造器的目的是给对象属性做赋值操作的

        注意：我们一般不会在空构造器中进行初始化操作，因为那样的话每个对象的属性就一样了

        构造器的一些要点：
        1.一般保证空构造器的存在，空构造器中一般不会进行属性的赋值操作
        2.一般我们会重载构造器，在重载的构造器中进行属性的赋值操作
        3.在重载构造器后，如果空构造器忘写了，系统也不会再分配默认的空构造器，此时调用时不给定初始属性的话就会报错
        4.为了见名知意，通常将构造器的形参和对应的类属性设为同样的名字，
            但这样会出现`属性名`和`形参名`因重名产生的歧义问题，为了解决这个问题，使用this指针修饰类属性，
            因为Java中，this指代的就是实例化对象本身，类似Python中的`self`
         */

        Person p = new Person("张三", 19, 1.78);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.height);

        Person p2 = new Person("李四", 20, 1.69);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);

        Person p3 = new Person();

    }
}