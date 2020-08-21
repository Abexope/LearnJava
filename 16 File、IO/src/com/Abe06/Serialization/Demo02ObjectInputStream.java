package com.Abe06.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *  对象反序列化流
 *
 *  java.io.ObjectInputStream  extends InputStream
 *      ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象。
 *      ObjectOutputStream和ObjectInputStream可以分别为与FileOutputStream和FileInputStream一起使用的对象图提供持久性存储的应用程序。
 *      ObjectInputStream用于恢复先前序列化的对象。 其他用途包括使用套接字流在主机之间传递对象，或者在远程通信系统中进行封送和解组参数和参数。
 *
 *  子类共性方法
 *     - int read(byte[] b)：从输入流读取一些字节数，并将它们存储到缓冲区 b
 *     - int read(byte[] b, int off, int len)：从输入流读取最多 len字节的数据到一个字节数组
 *     - void reset()：将此流重新定位到上次在此输入流上调用 mark方法时的位置
 *
 *  构造方法：
 *      - ObjectInputStream()：为完全重新实现ObjectInputStream的子类提供一种方法，不必分配刚刚被ObjectInputStream实现使用的私有数据。
 *      - ObjectInputStream(InputStream in)：创建从指定的InputStream读取的ObjectInputStream。
 *
 *  特有成员方法
 *      - Object readObject()：从ObjectInputStream读取一个对象。
 *
 *  使用步骤：
 *      1.创建 ObjectInputStream 对象，构造方法中给传递 FileInputStream 对象
 *      2.使用 ObjectInputStream 对象的 readObject() 方法读取对象文件
 *      3.释放资源
 *      4.使用对象（打印）
 *
 *  readObject() 方法声明了 ClassNotFoundException:
 *  反序列化的前提：
 *      1.类必须实现 Serializable 接口
 *      2.必须存在对应的字节码（.class）文件
 */

public class Demo02ObjectInputStream {
    public static void main(String[] args) {
        // 1.创建 ObjectInputStream 对象，构造方法中给传递 FileInputStream 对象
        try (FileInputStream fis = new FileInputStream("../person.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            // 2.使用 ObjectInputStream 对象的 readObject() 方法读取对象文件
            Object p;
            p = (Person) ois.readObject();
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {  // readObject() 方法声明了 ClassNotFoundException:
            e.printStackTrace();
        }
    }
}
