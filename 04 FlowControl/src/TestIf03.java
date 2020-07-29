import java.util.Scanner;

/**
 * if 分支嵌套
 */


public class TestIf03 {
    public static void main(String[] args) {
        // 从外部输入会员积分
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入会员积分：");
//        int score = sc.nextInt();
        int score;
        if (sc.hasNextInt()) {
            score = sc.nextInt();

            if (score > 0) {
                // 根据积分判断折扣
                if (score >= 8000) {
                    System.out.println("6折");
                } else if (score >= 4000) {
                    System.out.println("7折");
                } else if (score >= 2000) {
                    System.out.println("8折");
                } else {
                    System.out.println("9折");
                }
            } else {
                System.out.println("输入小于0");
            }

        } else {
            System.out.println("不是int类型数据");
        }


    }
}


class TestIf04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.print("输入性别：男/女");
        String sexStr = sc.next();
//        char sex = sexStr.charAt(0);

        if (age >= 7) {
            System.out.println("可以搬桌子");
        } else if (age >= 5 && sexStr.equals("男")) {
            System.out.println("性别是男，可以搬桌子");
        } else {
            System.out.println("你还太小了！");
        }
    }
}
