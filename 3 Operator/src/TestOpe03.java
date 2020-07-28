/**
 * 加法运算符：+
 */

public class TestOpe03 {
    /* + 运算符*/
    public static void main(String[] args) {
        // 表示正数
        System.out.println(+5);
        // 相加操作
        System.out.println(5+6);    // 常数相加
        System.out.println(5+'6');  // 字符相加，取字符对应的ASCII码相加
        // 字符串拼接
        // 规则：左右两侧的任意一侧有字符串，那么这个加号就是字符串拼接的作用，结果一定是字符串
        int num = 56;
        System.out.println("num=" + num);       // "num=56"
        System.out.println(5 + 6 + "7");        // "117"
        System.out.println(5 + '6' + "7");      // 5 + 54('6'的ASCII码) ---> 59 + "7" ---> "597"
        System.out.println("5" + 6 + "7");      // "567"
        System.out.println("5" + '6' + "7");    // "567"
        System.out.println("5" + '6' + '7');    // "567"
    }
}