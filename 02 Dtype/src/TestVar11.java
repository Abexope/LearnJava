import java.util.Scanner;

/**
 * 标准输入：Scanner
 */


public class TestVar11 {
    public static void main(String[] args) {
        // 实现功能：求圆的周长和面积
        final double PI = 3.14;      // 圆周率
        // 一个变量被 final 修饰，这个变量就变成一个常量，这个常量的值就不可变了
        // 这个常量就被称为`字符常量` ---> PI
        // 约定俗成：字符常量名全部大写

        // 拿来一个扫描器：
        Scanner sc = new Scanner(System.in);
        // 上扫描器扫描键盘
        // 给一个友好型的提示：
        System.out.print("请输入一个double类型的半径：");
        double r = sc.nextDouble();
//        double r = 5;               // 半径

        // 求周长
        double c = 2 * PI * r;
        System.out.println("周长为：" + c);

        // 求面积
        double s = PI * r * r;
        System.out.println("面积为：" + s);

    }
}


class TestVar12 {
    public static void main(String[] args) {
        // 键盘录入学生的信息：年龄，身高，姓名，性别
        Scanner sc = new Scanner(System.in);

        // 键盘录入年龄（接收整型）
        System.out.print("年龄：");
        int age = sc.nextInt();     // 定义一个int类型变量接收外部输入值

        // 键盘录入身高（接收浮点型）
        System.out.print("身高：");
        double height = sc.nextDouble();

        // 键盘录入姓名（接收字符串）
        System.out.print("姓名：");
        String name = sc.next();

        // 键盘录入性别（接收char类型）
        System.out.print("性别：");
//        String sexStr = sc.next();
//        char sex = sexStr.charAt(0);
        // 上面两句可以何为一句表示
        char sex = sc.next().charAt(0);

        System.out.println("学生信息\n姓名："+name+"\t性别："+sex+"\t年龄："+age+"\t身高："+height);
    }
}