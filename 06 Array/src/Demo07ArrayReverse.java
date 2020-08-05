import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组元素的反转
 */

public class Demo07ArrayReverse {

    public static void reverse(int[] arr) {     // 数组反转方法
        for (int i=0, j=arr.length-1; i < j; i++, j--) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60};          // 奇数长度
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};      // 偶数长度

        reverse(arr1);
        reverse(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
