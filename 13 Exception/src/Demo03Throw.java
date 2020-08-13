/**
 * throw关键字
 *  作用：
 *      可以使用throw关键子在指定的方法抛出指定的异常
 *  格式：
 *      throw new xxxException("异常产生的原因")
 *  注意：
 *      1.throw必须写在方法内部
 *      2.throw后面的new对象必须是 Exception 或者是 Exception 的子类
 *      3.throw抛出的指定的异常对象，我们就必须处理这个对象
 *          若 throw 抛出的是 RuntimeException 或者是 RuntimeException 的子类对象，
 *          我们可以不处理，默认交给JVM处理（打印异常对象、中断程序）
 *          若 throw 抛出的是编译异常（写代码时报错），此类异常必须处理，要么 throws，要么 try...catch
 */
public class Demo03Throw {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3);
    }

    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] arr
            int index
        实践中，对传递参数通常要做合法性检验，若参数不合法则抛出异常给方法调用者
        在此例中
            如果 arr == null，则主动抛出`空指针异常`
            如果 index < 0 或 index >= arr.length，则主动抛出`数组索引越界异常`
     */
    public static int getElement(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("传递的参数是null");
            // NullPointerException 属于 RuntimeException，通常默认交给JVM处理
        }
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("索引越界");
            // ArrayIndexOutOfBoundsException 也属于 RuntimeException，通常默认交给JVM处理
        }
        return arr[index];
    }

}
