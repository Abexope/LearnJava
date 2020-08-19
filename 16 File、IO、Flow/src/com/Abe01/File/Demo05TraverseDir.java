package com.Abe01.File;

import java.io.File;
import java.util.Objects;

/**
 * File类遍历文件夹
 *      - public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或目录
 *      - public File[] listFiles(): 返回一个File数组，表示该File目录中的所有的子文件或目录
 * 注意：
 *      1.list方法和listFiles方式遍历的时构造方法中给出的目录
 *      2.如果构造方法中给出的目录的路径不存在，会抛出空指针异常
 *      3.如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */

public class Demo05TraverseDir {
    public static void main(String[] args) {
        String dirPath = "E:\\实习-移动研究院\\20200525 AIOPS-NLP项目\\0812 PyOD changedegree\\sgw_yac_5_7_merge";
        File f = new File(dirPath);
//        for (String s : Objects.requireNonNull(f.list())) {
//            System.out.println(s);
//        }
//        for (File file : Objects.requireNonNull(f.listFiles())) {
//            System.out.println(file);
//        }
        for (File file : Objects.requireNonNull(f.listFiles())) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
