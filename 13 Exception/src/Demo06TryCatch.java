import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的第二种方式：自己处理
 *
 *  try ... catch：捕获异常
 *  格式：
 *      try {
 *          // 可能产生异常的代码
 *      } catch(定义异常变量，接收 try 中抛出的异常对象) {
 *          // 异常对象的处理逻辑
 *          实践中，会将异常记录到一个日志中
 *      }
 *      ... // 可以使用多个 catch() 接收多个不同的异常
 *      catch (异常类名 变量名) {
 *          ...
 *      }
 *  注意：
 *      1.try 中可能抛出多个异常，那么可以使用多个 catch 接收处理
 *      2.try 中的异常被对应的 catch 捕获后便在 catch 代码块中处理，完毕后程序不会中断，继续执行
 *          若 try 中没有出现异常，那么 catch 中的代码会被跳过
 *
 */

public class Demo06TryCatch {

    public static void main(String[] args) {   // 将异常继续向上抛出
        try {
            readFile("D:\\a.tx");
        } catch (IOException e) {   // 通常，catch 定义的异常对象接收变量的类型与 try 中抛出的相同
            System.out.println("catch - 传递文件的后缀不是 .txt");
        }
        System.out.println("后续方法");

    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
