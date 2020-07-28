import java.util.Arrays;

/**
 * 二维数组
 */


public class TestArray14 {
    public static void main(String[] args) {
        // 初识二维数组
        int[][] arr = new int[3][];     // 本质上还是一个长度为3的一维数组，此时数组中的元素为null
        System.out.println(Arrays.toString(arr));

        int[] a1 = new int[] {1, 2, 3};
        arr[0] = a1;
        System.out.println(Arrays.toString(arr));       // 打印子数组的首地址
        System.out.println(Arrays.toString(arr[0]));

        arr[1] = new int[] {4, 5, 6, 7};
        arr[2] = new int[] {9, 10};
        System.out.println(Arrays.toString(arr));

        for (int[] a: arr){
            System.out.println(Arrays.toString(a));     // 打印二维数组中的子数组
        }

        System.out.println(arr[1][2]);      // 访问二维数组中的元素

        // 遍历二维数组
        for (int[] a: arr){     // 增强遍历
            for (int s: a) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i ++) {         // 正常遍历
            for (int j = 0; j < arr[i].length; j ++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        // 正常遍历和增强遍历可以交替使用
    }
}


class TestArray15 {

    public static void print2DArray(int[][] arr) {
        // 打印二维数组
        for (int[] nums: arr) {
            System.out.println(Arrays.toString(nums));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 二维数组初始化
        int[][] arr = new int[][] {{1, 2}, {4, 5, 6}, {7, 8, 9, 9}};
        print2DArray(arr);

        int[][] arr1 = new int[3][2];
        print2DArray(arr1);
        arr1[1] = new int[] {9, 8, 7, 6};
        /*虽然初始化时定义子数组长度为2，但是后续仍旧能够强制赋值更长的数组(堆中的内存分配更加灵活?相对栈而言，是的)
        堆内存可以被JVM动态的分配内存大小，无需事先告诉编译器的数据的大小、生命周期等相关信息。*/
        print2DArray(arr1);

        int a = 10;
        int b = 10;
        System.out.println(b);
        System.out.println(a==b);
        a = 20;
        System.out.println(b==a);
        System.out.println();
    }
}
