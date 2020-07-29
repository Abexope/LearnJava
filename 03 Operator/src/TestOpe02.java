import java.util.Scanner;

public class TestOpe02 {
    public static void main(String[] args) {
        // 实现功能：任意给出一个四位数，求每一位上的数字并输出

        // 1.任意给出一个四位数
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入一个四位数：");
        int num = sc.nextInt();

        // 2.求每位上的输出数字
        // 个位数
        int num1 = num % 10;
        // 十位数
        int num2 = num / 10 % 10;
        // 百位数
        int num3 = num / 100 % 10;
        // 千位数
        int num4 = num / 1000;

        // 3. 输出每位上的数字
        System.out.println("个位上的数字为：" + num1);
        System.out.println("十位上的数字为：" + num2);
        System.out.println("百位上的数字为：" + num3);
        System.out.println("千位上的数字为：" + num4);
    }
}
