/**
 * if 单分支
 */


public class TestIf01 {
    public static void main(String[] args) {
        // 实现一个功能：随机给出3个数（1~6），对3个数求和运算，根据和的大小分配不同的奖品

//        // 1.给出3个数
//        int num1 = 2;
//        int num2 = 1;
//        int num3 = 1;

        // 1*.给出3个随机数
        // Java中依靠Math类生成随机数
        int num1 = (int)(Math.random()*6) + 1;
        int num2 = (int)(Math.random()*6) + 1;
        int num3 = (int)(Math.random()*6) + 1;

        // 2.求和
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        System.out.println(sum);

        // 3.根据和判断奖品
        // 如果sum>=14，一等奖
        if (sum >= 14) {
            System.out.println("一等奖");
        } else if (sum >= 10) {     // else：隐藏条件，跟上面条件表达式相反的功能
            System.out.println("二等奖");
        } else if (sum >= 6) {
            System.out.println("三等奖");
        } else {    // 尽量保证else的存在
            System.out.println("四等奖");
        }

    }
}

