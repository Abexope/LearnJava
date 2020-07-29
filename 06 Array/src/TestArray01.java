import java.util.Scanner;

/**
 * 引入数组的必要性
 */
public class TestArray01 {
    public static void main(String[] args) {
        // 功能：键盘录入十个学生的成绩，求和，求平均
        Scanner sc = new Scanner(System.in);
        double sum = 0.;
        for (int i = 0; i < 10; i ++) {
            int s = i + 1;
            System.out.print("请输入第" + s + "个学生的成绩：");
            double score = sc.nextDouble();     // 成绩录入即丢失
            sum += score;
        }
        double avg = sum / 10;
        System.out.println("总和：" + sum);
        System.out.println("平均：" + avg);
        // 第6个同学的成绩是多少?
    }
}
