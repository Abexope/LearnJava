/**
 * 整型变量
 */


public class TestVar05 {
    public static void main(String[] args) {
        // 定义整数类型变量
        int num1 = 12;      // 默认情况，十进制整型
        System.out.println(num1);
        int num2 = 012;     // 前面加上0，八进制整型
        System.out.println(num2);
        int num3 = 0x12;    // 前面加上0x或者0X，十六进制整型
        System.out.println(num3);
        int num4 = 0b10;    // 前面加上0b或者0B，二进制整型
        System.out.println(num4);

        // 定义byte型变量
        byte b = 126;       // 超出byte范围-128~127时，编辑器自动报错
        System.out.println(b);
        short s = 30000;    // short 类型
        System.out.println(s);
        int i = 123444;
        System.out.println(i);

        // 定义long型变量
        // 整数类型默认就是int类型的，所以1234567890是一个int类型的数，
        // 对于int类型来说，它超出了int的取值范围
        // 要想把一个数给long类型变量，那么在数字后面加上大写字母`L`就可以了
        long num5 = 12345678900L;
        // 注意：只有这个数超出了int类型的范围后，才需要加上L，否则无需加L也可以赋值给long类型(当然了，要是非得加L，也没事~)
        long num6 = 12;
        System.out.println(num6);
    }
}
