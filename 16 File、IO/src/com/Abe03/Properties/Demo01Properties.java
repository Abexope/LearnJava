package com.Abe03.Properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *  属性集
 *  java.util.Properties extends Hashtable<K, V> implements Map<K, V>
 *  Properties类表示一组持久的属性。 Properties可以保存到流中或从流中加载。 属性列表中的每个键及其对应的值都是一个字符串。
 *
 *  Properties 集合是一个唯一与IO流相结合的集合
 *
 *      store(): 将集合中的临时数据写入到硬盘中储存
 *          - void store(OutputStream out, String comments)：
 *              将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法加载到 Properties表中的格式输出流。
 *          - void store(Writer writer, String comments)：
 *              将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。
 *
 *      load(): 读取硬盘中保存的（键值对）文件并解析成集合对象
 *          - void load(InputStream inStream)：从输入字节流读取属性列表（键和元素对）。
 *          - void load(Reader reader)：以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
 *
 *  属性列表中每个键及其对应值都是一个字符串
 *      Properties 集合是一个双列集合，key和value默认都是字符串
 */

public class Demo01Properties {
    public static void main(String[] args) {
        show03();
    }

    /*
        load() 方法
            - void load(InputStream inStream)：从输入字节流读取属性列表（键和元素对）。
            - void load(Reader reader)：以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
        使用步骤：
            1.创建 Properties 集合对象
            2.使用 Properties 集合对象中的 load() 方法读取键值对文件
            3.遍历 Properties 集合
        注意：
            1.键值对文件中，键值对默认的连接符号可以使用 等号`=`、空格` `，或者其它符号
            2.键值对文件中，可以使用井号`#`进行注释，被注释的键值对不会被读取
            3.键值对文件中，键与值默认是字符串

     */
    private static void show03() {
        //  1.创建 Properties 集合对象
        Properties prop = new Properties();

        try(FileReader fw = new FileReader("../prop.txt")) {
            // 2.使用 Properties 集合对象中的 load() 方法读取键值对文件
            prop.load(fw);
            // 3.遍历 Properties 集合
            Set<String> set = prop.stringPropertyNames();
            for (String s : set) {
                System.out.println(s + ": " + prop.getProperty(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        store() 方法
            - void store(OutputStream out, String comments)：字节输出流，中文不适用
            - void store(Writer writer, String comments)：字符输出流，中文OK
                String comments: 注释，用来解释保存文件时做什么的，不支持中文，通常使用""空字符串
        使用步骤：
            1.创建 Properties 对象，添加数据
            2.创建字节流/字符流输出流对象，构造方法传入保存路径
            3.使用 Properties 对象的 store() 方法保存集合数据
            4.释放资源

     */
    private static void show02() {
        // 1.创建 Properties 对象，添加数据
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");

        try (FileWriter fw = new FileWriter("../prop.txt")) {
            prop.store(fw, "girls");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
        使用 Properties 集合存储数据，遍历取出 Properties 集合中的数据
        Properties 集合是一个双列集合，key和value默认都是字符串
        Properties 集合有专门处理字符串的方法
            - Object setProperty(String key, String value)：调用 Hashtable 的方法 put 。
            - String getProperty(String key)：通过key找value，相当于Map集合中的 get 方法。
            - Set<String> stringPropertyNames()：返回此属性列表的键集，相当于Map结合中的 keySet 方法
     */
    private static void show01() {
        // 创建 Properties 集合对象
        Properties prop = new Properties();
        // 使用 setProperty 向集合中添加数据
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");
        // 使用stringPropertyNames()方法取出键集
        Set<String> set = prop.stringPropertyNames();
        // 遍历Set集合来遍历prop
        for (String s : set) {
            System.out.println(s + ": " + prop.getProperty(s));
        }
    }
}
