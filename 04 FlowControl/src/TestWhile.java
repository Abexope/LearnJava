/**
 * while 循环
 */


public class TestWhile {
    public static void main(String[] args) {
        // while循环：求1+2+3+4+5
        int i = 1;
        int s = 0;
        while (i <= 100){
            s += i++;
        }
        System.out.println(s);

        i = 2;
        s = 0;
        while (i <= 1000) {
            s += i;
            i += 2;
        }
        System.out.println(s);

        i = 5;
        s = 0;
        while (i <= 100) {
            s += i;
            i += 5;
        }
        System.out.println(s);

        i = 1;
        s = 1;
        while (i <= 13) {
            s *= i;
            i += 2;
        }
        System.out.println(s);
    }
}

