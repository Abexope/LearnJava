/**
 * 数组的初始化
 */

class TestArray02 {
    public static void main(String[] args) {
        // 数组的作用：用来存储相同类型的数据
        // 以int类型数据为例

        // 1.声明
        int[] arr;
        int arr2[];
        // 如果只声明不赋值，相当于没定义
        int[] arr3 = null;      // 空
        // 辨别：数组赋值为null和什么都没有赋值，效果不一样

        // 2.创建
        arr = new int[4];       // 给数组开辟一个长度为4的存储空间
        // 编译期，声明和创建会合并成一句话： int[] arr = new int[4];

        // 3.赋值
        arr[0] = 12;
        arr[1] = 47;
        arr[3] = 56;
        arr[2] = 98;
        arr[2] = 46;    // 覆盖原有位置的值

        // 4.使用
        System.out.println(arr[2]);
        System.out.println(arr[2] + 100);
        System.out.println(arr.length);     // 数组长度（数组对象的长度属性）
    }
}
