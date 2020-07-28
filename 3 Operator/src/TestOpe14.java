/**
 * 位运算符：>> << ~
 */


public class TestOpe14 {
    public static void main(String[] args) {
        // 位运算
        int a = 8;
        a >>= 1;    // 除2
        System.out.println(a);
        a = 8;
        System.out.println(a<<1);   // 乘2
        System.out.println(6>>1);   // 向下整除2的移位数量次方
        System.out.println(6>>2);  // 有符号右移
        System.out.println(6>>>2); // 无符号右移
        System.out.println(~6);     // 取反

        // 运算符的优先级：赋值<三目<逻辑<关系<算术<单目
        System.out.println(5<6 | 'A'>'a' && 12*6<=45+23&&!true);
    }
}
