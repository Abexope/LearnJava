/**
 * 数组应用
 */

public class TestArray04 {

    public static int max(int[] arr) {
        int max_val = 0x00000000;
        for (int val: arr) {
            max_val = Math.max(max_val, val);
        }
        return max_val;
    }

    public static int[] fun() {
        int[] arr = {20, 20, 10};
        return arr;     // Java中可以返回数组对象
    }

    public static void main(String[] args) {
        // 数组求最值
        int[] arr = {12, 3, 7, 4, 8, 125, 9, 45};
        System.out.println(max(arr));
        for (int v: fun()){
            System.out.println(v);
        }

    }
}
