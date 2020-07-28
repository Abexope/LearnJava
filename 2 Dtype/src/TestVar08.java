/**
 * 字符编码
 */


public class TestVar08 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println(ch1 + 90);     // 将'A'的ASCII码与90做计算
        System.out.println(155 - ch1);    // 将'A'的ASCII码与155做计算
        // 对于char类型，我们看到的样子就是它本身的字面常量，但是底层在计算的时候使用的是ASCII码
        // 由于utf-16编码兼容ASCII，所以与Java的字符串编码规则不冲突

        char ch2 = '中';
        System.out.println(ch2);
        System.out.println(ch2 + 90);
        System.out.println(20103 - ch2);

        // 整型与字符型转换
        int num1 = (int)ch2;
        System.out.println(num1);   // 20103
        char ch = (char)num1;       // '中'
        System.out.println(ch);

        // 面试题
        char ch6 = '2' + 2;
        System.out.println(ch6);    // 4
    }
}

