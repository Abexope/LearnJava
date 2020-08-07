package Arrays_;

import java.util.Arrays;

/**
 * java.util.Arrays是一个与数组相关的功聚类，里面提供了大量静态方法，用来实现数组常见的操作
 *
 *      public static String toString(数组对象)：将参数数组变成字符串
 *          默认格式为：[元素1, 元素2, 元素3, ...]
 *      public static void sort(数组)：将数组升序排序
 *          备注：
 *              1. 如果时数值，sort默认升序排序
 *              2. 如果是字符串，sort默认按照字符编码升序排序
 *              3. 如果是自定义类型，这个自定义类需要有 Comparable 或者 Comparator 接口的支持
 */

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] arr = {60, 50, 100, 20, 30};
        System.out.println(Arrays.toString(arr));   // 打印
        Arrays.sort(arr);                           // 排序
        System.out.println(Arrays.toString(arr));
    }
}
