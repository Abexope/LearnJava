import java.io.Serializable;

/**
 * main方法的形参
 */


public class TestArray10 implements Serializable {

    private static final long serialVersionUID = -2807981240313920L;    // 自动添加序列化版本号

    public static void main(String[] args) {
        /*
         main方法的参数
         形参：字符串数组
         实参：长度为0的字符串数组【Java中，实例化长度为0的数组对象是被允许的】

         在命令行窗口调用JVM执行字节码文件时(或许以后还有更多方法)，可以向main方法中传递字符串实参
         */
        System.out.println(args.length);
        for (String str : args) {
            System.out.println(str);
        }
    }
}
