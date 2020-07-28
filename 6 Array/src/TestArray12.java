import java.util.Arrays;

/**
 * Arrays工具类
 */


public class TestArray12 {
    public static void main(String[] args) {
        // Arrays工具类
        int[] arr = {1, 3, 7, 2, 4, 8};
        System.out.println(Arrays.toString(arr));   // 数组的可视化

        Arrays.sort(arr);       // 数组排序
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 7));        // 二分查找元素，返回索引
        System.out.println(Arrays.binarySearch(arr, -7));       // 找不到时，返回任意非法索引值

        int[] arr2 = Arrays.copyOf(arr, arr.length);    // 数组复制
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOfRange(arr, 1, 4);     // 区间复制，[from, to)，“左闭右开”
        System.out.println(Arrays.toString(arr3));

        // 数组比较
        System.out.println(Arrays.equals(arr, arr2));   // 值比较，返回true
        System.out.println(arr==arr2);      // 地址比较，返回false

        int[] arr5 = Arrays.copyOf(arr, arr.length);
        Arrays.fill(arr5, 10);          // 数组填充，全部填充
        System.out.println(Arrays.toString(arr5));

        Arrays.fill(arr5, 1, 4, 0);     // 区间填充，[fromIndex, toIndex)，“左闭右开”
        System.out.println(Arrays.toString(arr5));

    }
}


class TestArray13 {
    public static void main(String[] args) {
        // System库中的数组复制方法 arraycopy
        int[] srcArr = new int[] {11, 22, 33, 44, 55, 66, 77, 88};        // 源数组
        int[] destArr = new int[10];                            // 目标数组

        // 复制
        System.arraycopy(srcArr, 1, destArr, 3, 3);
        System.out.println(Arrays.toString(srcArr));
        System.out.println(Arrays.toString(destArr));
    }
}
