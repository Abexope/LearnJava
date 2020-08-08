package Polymorphism04;

public class Mouse implements USB {
    // 鼠标是一个USB设备，鼠标实现了USB接口
    @Override
    public void open() {    // 接口提供的方法
        System.out.println("打开鼠标");
    }
    @Override
    public void close() {   // 接口提供的方法
        System.out.println("关闭鼠标");
    }
    public void click() {   // 实现类特有方法
        System.out.println("鼠标点击");
    }
}
