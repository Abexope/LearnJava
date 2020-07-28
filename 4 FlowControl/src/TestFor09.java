import java.util.Scanner;

/**
 * 花样输入
 */


public class TestFor09 {
    public static void main(String[] args) {
        /*
            实现一个功能：
            【1】请录入10个整数，当输入的数是666的时候，退出程序。
            【2】判断其中录入正数的个数并输出。
            【3】判断系统的退出状态：是正常退出还是被迫退出。
         */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int j = i + 1;
            System.out.print("请输入第 "+ j +" 个整数：");
            int num = sc.nextInt();
            if (num == 666) {
                System.out.println("正数的个数：" + count);
                System.out.println("被迫退出");
                return;
            }
            if (num > 0) {
                count ++;
            }
        }
        System.out.println("正数的个数：" + count);
        System.out.println("正常退出");
    }
}