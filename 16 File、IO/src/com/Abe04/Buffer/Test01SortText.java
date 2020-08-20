package com.Abe04.Buffer;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/**
 *  IO练习：文本排序
 *      按照文本的编号对文本重排序
 *
 *  分析：
 *      1.创建一个HashMap集合，key：文本编号，value：每行的文本内容
 *      2.创建 BufferReader，构造方法传入 FileReader
 *      3.创建 BufferWriter，构造方法传入 FileWriter
 *      4.使用 BufferReader 的 readLine() 方法逐行读取文本
 *      5.对文本进行拆分，获取文本的序号和内容
 *      6.将序号和内容存入HashMap集合（key是有序的，会自动排序）
 *      7.遍历HashMap，获取键值对
 *      8.将键值对重新拼接
 *      9.使用 BufferWriter 的 write() 方法将拼接字符串写入到文件中
 *      10.释放资源
 */

public class Test01SortText {
    public static void main(String[] args) {
        // 1.创建一个HashMap集合，key：文本编号，value：每行的文本内容
        HashMap<String, String> map = new HashMap<>();
        try (
                // 2.创建 BufferReader，构造方法传入 FileReader
                FileReader fr = new FileReader("../a.txt");
                // 3.创建 BufferWriter，构造方法传入 FileWriter
                FileWriter fw = new FileWriter("../b.txt"))
        {
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            // 4.使用 BufferReader 的 readLine() 方法逐行读取文本
            String line;
            while ((line = br.readLine()) != null) {
                // 5.对文本进行拆分，获取文本的序号和内容
                String key = line.substring(0, 1);
                String value = line.substring(1);
                // 6.将序号和内容存入HashMap集合（key是有序的，会自动排序）
                map.put(key, value);
            }
            // 7.遍历HashMap，获取键值对
            for (Map.Entry<String, String> entry: map.entrySet()) {
                // 8.将键值对重新拼接
                line = entry.getKey() + entry.getValue();
                // 9.使用 BufferWriter 的 write() 方法将拼接字符串写入到文件中
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            // 10.释放资源
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
