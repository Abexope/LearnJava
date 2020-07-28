/**
 * 数组的遍历，使用数组解决TestArray01中的问题
 */


public class TestArray03 {
    public static void main(String[] args) {
        // 使用数组
//        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
//        System.out.println(arr[1]);
        double sum = 0.0;
        for (int i = 0; i < arr.length; i ++) {
//            int s = i + 1;
//            System.out.print("请输入第" + s + "个同学的分数：");
//            arr[i] = sc.nextDouble();
            arr[i] = Math.random();
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(sum/=arr.length);
        System.out.println(arr[6-1]);   // 第6个同学的分数
        System.out.println();

        for (double v : arr) {      // 增强for循环：直接遍历数组元素，类似Python中的 for item in list[object]:
            // 优点：代码简洁
            // 缺点：没有索引信息
            System.out.println(v);
        }

        System.out.println();

        for (int i = 9; i >= 0; i --) {     // 逆向遍历
            System.out.println(arr[i]);
        }
    }
}