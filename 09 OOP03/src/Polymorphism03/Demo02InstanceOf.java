package Polymorphism03;

/**
 * 多态之`父类引用指向继承类的对象`（二）
 *
 * 如何才能知道一个父类引用的对象，本来是什么子类：instanceof
 *
 *  格式：[对象名] instanceof [类名]
 *  返回boolean结果，表示判断前面的对象能否作为后面类型的实例
 */

public class Demo02InstanceOf {
    public static void main(String[] args) {
        giveMeAPet(new Dog());
        System.out.println("============");
        giveMeAPet(new Cat());
    }
    public static void giveMeAPet(Animal animal) {
        // 在实际开发类似的方法中，我们无法确定此时的animal究竟是哪个子类的实例化对象
        // 此时使用 instanceof 就显得十分必要

        // 如果希望调用子类特有方法，需要向下转型
        if (animal instanceof Dog) {    // 判断animal是否是一个狗类的实例?
            Dog dog = (Dog) animal;
            dog.watchHouse();   // 狗看家
        }
        if (animal instanceof Cat) {    // 判断animal是否是一个猫类的实例?
            Cat cat = (Cat) animal;
            cat.catchMouse();   // 猫抓老鼠
        }
    }
}
