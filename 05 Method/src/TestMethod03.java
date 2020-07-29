import java.util.Scanner;

/**
 * 猜数
 */

public class TestMethod03 {

    public static boolean guessNum(int num) {
        int target = 10;
        if (num > target) {
            System.out.println("猜大了");
            return false;
        } else if (num < target) {
            System.out.println("猜小了");
            return false;
        } else {
            System.out.println("猜对了，结果就是 " + target);
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请猜一个整数：");
            int num = sc.nextInt();
            if (guessNum(num)) break;
        }
    }

}
