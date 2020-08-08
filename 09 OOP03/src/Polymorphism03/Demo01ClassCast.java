package Polymorphism03;

/**
 * 多态之`父类引用指向继承类的对象`（一）
 *
 * 向上转型与向下转型
 *
 *      向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端
 *          对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
 *
 *      解决方案：用对象的向下转型【还原】。请注意：只有对象`本来是猫，才能还原成猫`，否则JVM会抛出类转换异常
 *
 *
 */


public class Demo01ClassCast {
    public static void main(String[] args) {
        // 对象的向上转型，就是父类引用指向子类对象
        Animal animal = new Cat();      // 本来创建的是一只猫，猫向上转型为动物
        animal.eat();
        // animal.catchMouse();            // 错误写法！Animal类没有这方法

        // 向下转型，进行`还原`动作
        Cat cat = (Cat) animal;
        cat.catchMouse();   // 原本是猫，成功还原

        // 下面是错误的向下转型，原本new的是猫，非要转成狗
        Dog dog = (Dog) animal;
        dog.watchHouse();
        // 错误写法，编译时不会报错，但是运行时会抛出异常：java.lang.ClassCastException 类转换异常
    }
}
