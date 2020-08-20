package com.Abe01.File;

import java.io.File;
import java.io.FileFilter;
import java.util.Objects;

/**
 * 高效的文件搜索：文件过滤器
 *      使用递归实现遍历指定路径，使用文件过滤器筛选以.java为结尾的文件路径并打印
 *
 * 在File类中有两个 listFiles() 的重载方法，方法传递的参数是文件过滤器对象
 * 1.File[] listFiles(Demo07FileFilter filter)
 * java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
 *      作用：用来过滤文件（File对象）
 *      唯一的抽象方法：用来过滤文件的方法
 *          - boolean accept(File pathname): 测试指定抽象路径名是否应该包含在某个路径名列表中
 *          参数：
 *              File pathname: 使用listFiles方法遍历目录，得到的每一个文件对象
 * 2.File[] listFiles(FilenameFilter filter)
 * java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
 *      作用：用于过滤文件名称
 *      唯一的抽象方法：用来过滤文件的方法
 *          - boolean accept(File pathname, String name): 测试指定文件是否应该包含在某一文件列表中
 *          参数：
 *              File dir：构造方法中传递的被遍历的目录
 *              String name：使用listFiles方法遍历目录，获取的每个文件/文件夹的名称
 * 注意：
 *      两个过滤器接口均没有实现类，需要自行定义实现类并重写 accept() 方法自定义过滤规则
 */

public class Demo07FileFilter {
    private static int count = 0;

    public static void main(String[] args) {
        printPath(new File("D:\\LearnJava"));
        System.out.println(count);
    }

    private static void printPath(File f) {
        if (f.isFile()) {
            System.out.println(f.getAbsolutePath());
            count ++;
            return;
        }
        for (File file : Objects.requireNonNull(f.listFiles(new FileFilterImpl()))) {   // 传递过滤器对象
            if (file.isDirectory())
                printPath(file);
            else {
                System.out.println(file.getAbsolutePath());
                count ++;
            }
        }
    }
}


class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        // 如果pathname是以.java文件结尾或者pathname表示一个文件夹，那么返回true，否则返回false
        return pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory();
    }
}