package Polymorphism04;

/**
 * 笔记本类
 */

public class LapTop {       // 笔记本通过USB接口使用了USB设备
    public void powerOn() {
        System.out.println("笔记本开机");
    }
    public void powerOff() {
        System.out.println("笔记本关机");
    }
    public void useDevice(USB usb) {    // 多态：接口指向实现类的对象
        // 使用USB设备的方法，使用接口作为方法的形参
        usb.open();     // 接口方法
        if (usb instanceof Mouse) {     // 先判断接口的实现类
            Mouse mouse = (Mouse) usb;  // 再根据不同的实现类向下转型
            mouse.click();      // 执行实现类特有方法
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();    // 实现类特有方法
        }
        usb.close();    // 接口方法
    }
}
