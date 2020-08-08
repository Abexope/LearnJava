package Polymorphism04;

public class KeyBoard implements USB {
    // 键盘是一个USB设备，键盘实现了USB接口
    @Override
    public void open() {    // 接口提供的方法
        System.out.println("打开键盘");
    }
    @Override
    public void close() {   // 接口提供的方法
        System.out.println("关闭键盘");
    }
    public void type() {    // 实现类特有方法
        System.out.println("键盘输入");
    }
}
