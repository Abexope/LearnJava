package Polymorphism02;

/**
 * 多态下的成员变量访问规则
 * 访问成员变量的两种方式：
 *      1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
 *      2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 */
public class DemoMultiField {
    public static void main(String[] args) {
        // 多态写法，父类引用指向子类对象
        Fu obj = new Zi();              // 10
        System.out.println(obj.num);
        System.out.println("==================");

        // 子类没有覆盖重写：看父类，10
        // 子类重写了：看子类，20
        obj.showNum();
    }
}




