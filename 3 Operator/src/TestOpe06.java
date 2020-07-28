/**
 * 赋值运算符：=
 */


public class TestOpe06 {
    public static void main(String[] args) {
        // 任意给出两个数，交换两个数并输出
        // 1.给出两个数
        int num1 = 10;
        int num2 = 20;
        // 输出两个变量交换前的数值
        System.out.println("交换前");
        System.out.print("num1=" + num1);
        System.out.println("\tnum2=" + num2);
        // 交换变量
        int t;  //
        t = num1;
        num1 = num2;
        num2 = t;
        System.out.println("交换后");
        System.out.print("num1=" + num1);
        System.out.println("\tnum2=" + num2);
    }
}
