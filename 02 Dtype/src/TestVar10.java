/**
 * 数据类型转换
 */


public class TestVar10 {
    public static void main(String[] args) {
        // 数据类型转换
        double d = 6; // int -> double 自动类型转换（自转）
        System.out.println(d);
        // int i = 6.5;    // double -> int 浮点赋值给整型，数据会造成损失！
        int i = (int)6.5;    // 强制类型转换（强转）
        System.out.println(i);

        // 在同一个表达式中，有多个数据类型的时候，应该如何处理?
        double d2 = 12 + 1294L + 8.5F + 'a';
        // 多种数据类型参与运算时，整型、浮点型、字符型均可参与运算，唯独布尔型不可以
        System.out.println(d2);
        /*
        类型级别：由低到高
        byte, short, char ---> int ---> long ---> float ---> double
        级别用来做什么?
            当一个表达式中有多种数据类型的时候，要找出当前表达式中级别最高的数据类型，
            然后，其余类型都转化为当前表达式中级别最高的类型进行计算
         */
        int i2 = (int)(12 + 1294L + 8.5F + 'a');    // 给表达式加括号‘()’: 对整个表达式做强制类型转换，否则只是对第一项做转换
        System.out.println(i2);
        /*
        在进行运算的时候：
        左=右：直接赋值
        左<右：强转
        左>右：自转
         */

        // 以下几种情况属于特殊情形
        byte b = 12;    // byte类型的取值范围：-128 ~ 127
        System.out.println(b);
        // 对于 byte, short, char类型来说，只要在他们的表示范围中，赋值的时候就不需要进行强转，直接赋值即可
        byte b2 = (byte)270;        // 高位内存被强制截断
        System.out.println(b2);
    }
}

