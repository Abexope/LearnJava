package Polymorphism04;

/**
 * 多态之`接口引用指向实现类的对象`
 *
 * 案例：USB接口
 */


public class DemoMain {
    public static void main(String[] args) {
        // 实例化一个笔记本
        LapTop lapTop = new LapTop();
        lapTop.powerOn();

        // `外部`实现多态：自定义接口指向实现类的对象
        USB mouse = new Mouse();     // 实例化一个鼠标，并通过笔记本使用
        lapTop.useDevice(mouse);

        // `内部`实现多态：形参接口指向实参的实现类的对象
        lapTop.useDevice(new KeyBoard());     // 直接调用一个实现USB接口的对象

        // 外部未实现多态，传参时依旧是形参接口指向实参的实现类的对象，还是多态
        Mouse mouse1 = new Mouse();
        lapTop.useDevice(mouse1);
        // 接口实现的多态依旧满足`向上转型`和`向下转型`的各种规则

        lapTop.powerOff();
    }
}
