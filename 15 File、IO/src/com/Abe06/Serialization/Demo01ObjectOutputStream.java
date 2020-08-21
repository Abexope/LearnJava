package com.Abe06.Serialization;

import java.beans.Transient;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  对象序列化流
 *
 *  java.io.ObjectOutputStream extends OutputStream
 *      ObjectOutputStream将Java对象的原始数据类型和图形写入OutputStream。
 *      可以使用ObjectInputStream读取（重构）对象。 可以通过使用流的文件来实现对象的持久存储。
 *      如果流是网络套接字流，则可以在另一个主机上或另一个进程中重构对象。
 *
 *  子类通用方法
 *      - public void close(): 关闭此输出流并释放与此流相关联的任何系统资源
 *      - public void flush(): 刷新输出流并强制任何缓冲的输出字节被写出
 *      - public void write(byte[] b): 将 b.length 字节从指定的字节数组写入此输出流
 *      - public void write(byte[] b, int off, int len): 从指定的字节数组接入 len 字节，从偏移量 off 开始输出到此输出流
 *      - public abstract void write(int b): 将指定字节写入此输出流
 *
 *  构造方法
 *      - ObjectOutputStream()：
 *          为完全重新实现ObjectOutputStream的子类提供一种方法，不必分配刚刚被ObjectOutputStream实现使用的私有数据。
 *      - ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream。
 *
 *  特有成员方法
 *      void writeObject(Object obj)：将指定的对象写入ObjectOutputStream。
 *
 *  使用步骤：
 *      1.创建 ObjectOutputStream 对象，构造方法中传递 FileOutputStream 对象
 *      2.使用 ObjectOutputStream 对象的 writeObject() 方法，将对象写入到文件中
 *      3.释放资源
 *
 *  transient & static
 *      静态成员变量由于其追随类本身，所以不会随对象序列化
 *      如果不想序列化不同成员变量，则可以使用 transient 关键字修饰
 */

public class Demo01ObjectOutputStream {
    public static void main(String[] args) {

        Person p = new Person("迪丽热巴", 22);

        // 1.创建 ObjectOutputStream 对象，构造方法中传递 FileOutputStream 对象

        try (FileOutputStream fos = new FileOutputStream("../person.txt");) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // 2.使用 ObjectOutputStream 对象的 writeObject() 方法，将对象写入到文件中
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
