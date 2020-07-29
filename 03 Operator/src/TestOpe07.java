/**
 * 自增运算符
 */


public class TestOpe07 {
    public static void main(String[] args) {
        // 自增运算符特性
        byte a = 10;
        int b = 20;

        // a+b 的结果是int型，将int变量赋值给byte变量，需要做强制类型转换！
        a += b;     // += 操作：自动实现数据类型转换
        System.out.println(a);
        a = (byte)(a + b);     // = 赋值操作：需要手动实现数据类型转换
        System.out.println(a);
    }
}
