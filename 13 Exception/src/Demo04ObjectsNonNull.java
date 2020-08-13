import java.util.Objects;

/**
 * Objects类中的静态方法：空值判断
 *  - public static <T> T requireNonNull(T obj)：查看指定对象是否为 null
 *  源码：
 *      public static <T> T requireNonNull(T obj) {
 *          if (obj == null)
 *              throw new NullPointerException();
 *          return obj;
 *      }
 */

public class Demo04ObjectsNonNull {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj) {
        // 判断 obj 是否为 null
        /*if (obj == null) {
            throw new NullPointerException("传递的对象是null");
        }*/
        // 利用 Objects 类实现空值判断
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象是null");  // 重载方法，添加异常说明文本
    }
}
