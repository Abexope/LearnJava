import java.util.Scanner;

/**
 *  三目运算符： a?b:c
 */


public class TestOpe11 {
    public static void main(String[] args) {
        // 三元运算符
        int num = (5>7)?6:9;
        System.out.println(num);
        String str = (4!=8)?"good":"bad";
        System.out.println(str);
    }
}


class TestOpe12 {
    public static void main(String[] args) {
        // 实现功能：男孩女孩选择晚饭吃什么，如果意见一致，听男生的，如果意见不一致，听女生的

        // 1.要让男孩女孩选择晚饭吃什么：
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择晚饭吃什么?  1.火锅 2.烧烤 3.西餐 4.麻辣烫");
        System.out.print("请男孩选择：");
        int boyChoice = sc.nextInt();
        System.out.print("请女孩选择：");
        int girlChoice = sc.nextInt();

        // 2.判断
        int result = (boyChoice==girlChoice)?boyChoice:girlChoice;
        System.out.println("今晚吃：" + result);
    }
}