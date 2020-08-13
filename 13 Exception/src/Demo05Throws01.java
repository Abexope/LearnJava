import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的第一种方式：交给别人处理
 *
 *  throws关键字
 *  作用：
 *      将异常抛给方法的调用者处理，最终交给JVM处理
 *  格式：
 *      与 throw 关键字配合使用
 *      修饰符 返回值类型 方法名(参数列表) throws AAAAException, BBBBException, ... {
 *          throw new AAAAException("异常原因A");
 *          throw new BBBBException("异常原因B");
 *          ...
 *      }
 *  注意：
 *      1.throws 必须写在方法声明处
 *      2.throws 声明的异常必须是 Exception 或 Exception 的子类
 *      3.若方法内部抛出多个异常，throws 后面必须全部声明
 *          若多个异常对象之间存在继承关系，则直接声明父类异常即可
 *      4.调用了一个声明异常的方法，就必须处理声明的异常
 *          要么继续使用 throws 声明抛出给上一级调用对象，直至JVM
 *          要么 try...catch 自己处理
 */

public class Demo05Throws01 {
    /*
        FileNotFoundException extends IOException extends Exception
        若多个异常对象之间存在继承关系，则直接声明父类异常即可
        即 FileNotFoundException 可省略
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {   // 将异常继续向上抛出
        readFile("C:\\a.tx");
    }

    /*
        定义一个方法，对传递文件路径做合法性判断
     */
    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        /*
            如果路径不是 "C:\\a.txt"，则抛出`无法找到文件异常`，告知方法调用者
            注意：
                FileNotFoundException 属于编译异常，一旦抛出编译异常，就必须处理！
                使用 throws 继续声明抛出 FileNotFoundException 异常对象，交给方法调用者处理
         */
//        if (!fileName.equals("C:\\a.txt")) {
//            throw new FileNotFoundException("传递文件路径不是 C:\\a.txt");
//        }

        /*
            如果传递的路径不是 `.txt` 结尾
            则抛出 IO异常对象，告知方法调用者，告知文件后缀名不对
         */
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }


        System.out.println("路径没有问题，读取文件");
    }
}
