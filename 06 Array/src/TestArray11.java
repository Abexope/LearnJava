/**
 * 不定长传参
 */


public class TestArray11 {
    // 不定传参

    public static void main(String[] args) {
        method01(0, 1, 2, 3, 4, 5, 6);
    }

    public static void method01(int num, int...nums){
        // int...不定长传参，可以传入任意数量的int型变量或承载多个int型变量的集合类对象
        // 当然也可以是
        // double.../boolean.../
        System.out.println(num);
        for (int v: nums) {
            System.out.println(v);
        }
    }
}