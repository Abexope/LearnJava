package Polymorphism02;

/**
 *多态下的成员方法调用规则
 *      看new的是谁就优先用谁，没有则向上找
 *      口诀：编译看左边，运行看右边
 *  对比成员变量：编译看左边，运行还看左边
 */
public class DemoMultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();       // 父子都有，优先用子(因为new的是子)
        obj.methodFu();     // 子类没有父类有，向上找到父类

        // 编译看左：左边是Fu，Fu中没有methodZi()，所以编译报错
        // 运行看右：右边是Zi，Zi中有method()就运行method()，Zi中没有methodFu()就去父类中找methodFu()
//      obj.methodZi();     // 异常
    }
}
