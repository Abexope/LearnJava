import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        // Exception：编译期异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");      // 格式化日期
        // 使用 try ... catch ... 捕获异常
        try {
            Date date = sdf.parse("1999-0909");    // 将字符串格式的日期解析为 Date 格式的日期
            System.out.println(date);
        } catch (ParseException e) {
//            e.printStackTrace();
        }
        System.out.println("1111111111");   // 抛出异常后，程序能够继续执行

        // RuntimeException：运行期异常，Java程序运行过程中出现的问题
        int[] arr = {1, 2, 3};
        try {
            // 可能出现异常的代码
            System.out.println(arr[3]);     // 索引越界异常，运行期才能发现的异常
        } catch (ArrayIndexOutOfBoundsException  e){
            // 出现异常后的处理过程
//            e.printStackTrace();
        }

        // Error：错误
//        int[] arr1 = new int[1024*1024*1024];   // 必须修改代码才能正常运行
        //  java.lang.OutOfMemoryError：内存溢出错误，创建的数组太大，超出给JVM分配的内存值





        System.out.println("后续代码");

    }
}
