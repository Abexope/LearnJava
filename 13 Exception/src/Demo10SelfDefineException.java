/**
 * 自定义异常类
 *  格式：
 *      public class XXXException extends Exception / RuntimeException {
 *
 *          // 空参构造方法
 *          public void XXXException() {}
 *
 *          // 带有异常信息的构造方法
 *          public void XXXException(...) {
 *              // 异常信息
 *          }
 *
 *      }
 *  注意：
 *      1.自定义异常类通常以 Exception 作为命名结尾，`见名知义`
 *      2.自定义异常类必须继承自 Exception类 或者 RuntimeException类
 *          继承 Exception类：那么自定义异常类就属于编译器异常，如果方法内部抛出此异常，要么 throws，要么 try...catch
 *          继承 RuntimeException类：通常交给JVM处理（中断处理）
 */

public class Demo10SelfDefineException {
}


class RegisterException extends /*Exception*/ RuntimeException {

    // 空参构造方法
    public RegisterException() { }

    // 带有异常信息的构造方法 （ALT+INSERT 自动化）
    public RegisterException(String message) {
        super(message);
    }

}

