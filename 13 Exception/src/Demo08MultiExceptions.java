import java.util.*;

/**
 * 多异常捕获
 *  1.多个异常分别处理
 *  2.多个异常一次捕获，分别处理
 *      注意：
 *          1) catch 捕获的多个异常对象如果存在继承关系，那么子类异常对象必须定义在父类前面，否则报错
 *  3.多个异常一次捕获，一次处理
 *
 */

public class Demo08MultiExceptions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);

        /*System.out.println(arr[3]);     // [异常1] ArrayIndexOutOfBoundsException
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);
        System.out.println(list.get(3));    // [异常2] IndexOutOfBoundsException*/

        // 1.多个异常分别处理
        try {
            System.out.println(arr[3]);     // [异常1] ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(list.get(3));    // [异常2] IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("------ 1 ------");
        System.out.println("后续代码1");

        // 2.多个异常一次捕获，分别处理
        /*
            catch 捕获的多个异常对象如果存在继承关系，那么子类异常对象必须定义在父类前面，否则报错
            ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException

            原因：多态的规则，子类对象可以赋值给父类，反之不行！
            IndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException()
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException()
         */
        try {
            System.out.println(arr[3]);     // [异常1] ArrayIndexOutOfBoundsException
            System.out.println(list.get(3));    // [异常2] ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();    //
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("------ 2 ------");
        System.out.println("后续代码2");

        // 3.多个异常一次捕获，一次处理
        try {
            System.out.println(arr[3]);     // [异常1] ArrayIndexOutOfBoundsException
            System.out.println(list.get(3));    // [异常2] ArrayIndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {     // IndexOutOfBoundsException 可以接收上面的所有异常
            e.printStackTrace();
        }

        System.out.println("------ 3 ------");
        System.out.println("后续代码3");

    }
}
