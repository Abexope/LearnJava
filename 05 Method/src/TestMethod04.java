/**
 * 方法重载
 */


public class TestMethod04 {
    // 方法的重载：不定长传参

    public static int add(int num1, int num2) {return num1 + num2;}

    public static int add(int num1, int num2, int num3) {return num1 + num2 + num3;}

    public static int add(int num1, int num2, int num3, int num4) {return num1 + num2 + num3 + num4;}

    public static double add(double num1, double num2) {return num1 + num2;}

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(3, 4, 5));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(3.2, 6.8));
    }

}


class TestMethod05{
    // 方法重载：不固定输入变量类型

    public static void main(String[] args){
        add(5);
        //级别：byte,short,char-->int-->long-->float--->double
    }

    public static void add(double num1){
        System.out.println("------2");
    }
    public static void add(float num1){
        System.out.println("------3");
    }
    public static void add(long num1){
        System.out.println("------4");
    }

    public static void add(int num1){
            System.out.println("------1");
    }
}
