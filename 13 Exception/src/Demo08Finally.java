import java.io.IOException;

/**
 * Finally代码块
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
 *      } finally {
 *          // finally代码块，无论是否出现异常都会执行
 *      }
 *  注意：
 *      1.finally 代码块不能单独使用，必须与 try 配合使用
 *      2.通常，finally 被应用于资源释放（资源回收），无论程序是否出现异常，最后都要释放资源（IO流）
 *      3.如果 finally 中存在 return 语句，则永远返回 finally 中的结果，要避免在 finally 中写 return 语句
 */

public class Demo08Finally {

    public static void main(String[] args) {   // 将异常继续向上抛出
        try {
            readFile("D:\\a.tx");
            System.out.println("AAA BBB CCC");     // 当捕获到异常时，try 代码块中异常代码行之后的代码会被跳过
        } catch (IOException e) {   // 通常，catch 定义的异常对象接收变量的类型与 try 中抛出的相同
            e.printStackTrace();
        } finally {
            // finally代码块，无论是否出现异常都会执行
            System.out.println("资源释放");
        }

        System.out.println();
        System.out.println("===============");
        System.out.println("后续方法");

    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
