/**
 * do while 循环
 */


public class TestDoWhile {
    public static void main(String[] args) {
        // do-while循环
        int i = 1;
        int s = 0;
        do {            // 对比while，至少执行一轮循环
            s += i++;
        } while (i <= 100);
        System.out.println(s);
    }
}
