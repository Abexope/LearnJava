import java.io.IOException;

/**
 *  Throwable类中的三个常用打印异常信息的方法
 *      - String getMessage(): 返回此 throwable 的简短描述
 *      - String toString(): 重写 toString() 方法，返回此 throwable 的详细消息字符串
 *      - void printStackTrace(): JVM打印异常对象，默认此方法打印的异常信息是最全面的
 */

public class Demo07Throwable {

    public static void main(String[] args) {   // 将异常继续向上抛出
        try {
            readFile("D:\\a.tx");
        } catch (IOException e) {   // 通常，catch 定义的异常对象接收变量的类型与 try 中抛出的相同
            // 自定义打印异常信息
            System.out.println("catch - 传递文件的后缀不是 .txt");
            // 使用 throwable 中的方法输出异常信息
            System.out.println(e.getMessage());     // 文件后缀名不对
            System.out.println(e.toString());       // java.io.IOException: 文件后缀名不对
            e.printStackTrace();    /*java.io.IOException: 文件后缀名不对
                                        at Demo07Throwable.readFile(Demo07Throwable.java:33)
                                        at Demo07Throwable.main(Demo07Throwable.java:15)*/
        }
        System.out.println();
        System.out.println("后续方法");

    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
