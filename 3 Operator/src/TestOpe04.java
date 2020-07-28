/**
 * 加加运算符：++
 */


public class TestOpe04 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        a++;    // a = a + 1
        System.out.println(a);
        ++a;    // a = a + 1
        System.out.println(a);

        // 总结：++单独使用时，无论放在前还是后，都是`加1`操作

        // 将++参与到运算中
        // 规则：看++在前还是后，如果++在后：先运算，后加1；如果++在前，先加1，后运算
        a = 5;
        int m = a++ + 7;        // 先运算 m = a + 7，再运算：a = a + 1
        System.out.println(m);  // 12
        System.out.println(a);  // 6

        a = 5;
        int n = ++a + 7;        // 先加1 a = a + 1，在运算：n = a + 7
        System.out.println(n);  // 13
        System.out.println(a);  // 6
    }
}


class TestOpe05 {
    public static void main(String[] args) {
        // 运算符的优先级：++ 的级别大于 +
        int a = 5;
        System.out.println(a++ + a++);      // 5 + 6 = 11, a=7
        System.out.println(a++ + ++a);      // 7 + 9 = 16, a=9
        System.out.println(++a + a++);      // 10 + 10 = 20, a = 11
        System.out.println(++a + ++a);      // 12 + 13 = 25, a = 13
    }
}
