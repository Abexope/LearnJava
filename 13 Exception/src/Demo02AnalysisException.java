/**
 * 解析异常过程：分析原因，探究处理
 */

public class Demo02AnalysisException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3);
        System.out.println(e);

    }

    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] arr
            int index
     */
    public static int getElement(int[] arr, int index) {
        return arr[index];
    }
}
