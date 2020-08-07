package Polymorphism01;

/**
 * 代码中体现多态性：父类引用指向子类对象
 *
 * 格式：
 *      1. [父类名称] [对象名] = new [子类名称]();
 *      2. [接口名称] [对象名] = new [子类实现名称]();
 */

public class DemoMulti {
    public static void main(String[] args) {
        // 多态写法：左侧父类引用`指向`右侧子类对象
        Fu obj = new Zi();
        obj.method();       // `new谁运行谁`
        obj.methodFu();     // 子类中没有对应方法才去父类中找
    }
}
