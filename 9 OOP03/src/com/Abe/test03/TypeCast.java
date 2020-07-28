package com.Abe.test03;



public class TypeCast {

    public static void main(String[] args) {
        Pig pig = new Pig();                // 子类

        Animal an = (Animal) pig;           // 子类强转为父类，向上转型
        an.shout();                         // OK

        Pig p = (Pig) an;                   // 在向上转型的前提下，父类强转为子类，向下转型
        p.shout();                          // OK
        p.eat();                            // OK
    }
}


class TypeCastError {

    public static void main(String[] args) {
        /*警告：以下代码存在异常无法运行！*/

        Animal animal1 = new Animal();      // 父类
        Pig pig1 = new Pig();               // 子类

        Pig p1 = (Pig) animal1;             // 在没有向上转型的前提下，父类强转为子类，异常，不可以！
        p1.shout();                         // ClassCastException
        p1.eat();                           // ClassCastException

        /*
            由于子类中有的方法，父类中不一定有
            因此，一个变量确定指向父类后，强转为子类时，
            JVM就会报ClassCastException，即类型间转换不兼容！
        */
    }

}
