/**
 * 浮点型变量
 */
public class TestVar06 {
    public static void main(String[] args) {
        // 浮点型常量的两种形式
        // 十进制形式
        double num1 = 3.14;
        // 科学计数法形式
        double num2 = 314e-2;
        System.out.println(num1);
        System.out.println(num2);

        // 浮点类型变量
        // 注意：浮点型默认是 double 类型，要想将一个 double 类型的变量赋值给 float，必须后面加上F
        float f1 = 3.1415926535F;       // 强制赋值给 float 变量后，高精度会被截断
        System.out.println(f1);
        double d1 = 3.1415926535D;  // 标准的 double 变量后面加数字D，但通常可以省略
        System.out.println(d1);

        // 注意：尽量避免浮点类型变量之间的比较！
        float f2 = 0.3F;        // float 占 4 字节
        double d2 = 0.3;        // double 占 8 字节
        System.out.println(f2 == d2);   // false
        System.out.println(1 == 1);
        // Java 中的逻辑常量：`true` 和 `false`
    }
}
