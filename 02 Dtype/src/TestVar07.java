/**
 * 字符变量与字符串
 */


public class TestVar07 {
    public static void main(String[] args) {
        // 定义字符类型的变量
        char ch1 = 'a';
        System.out.println(ch1);
        char ch2 = 'A';
        System.out.println(ch2);
        char ch3 = '4';
        System.out.println(ch3);
        char ch4 = '中';
        System.out.println(ch4);
        char ch5 = '?';
        // Java中无论：字母，数字，符号，中文都是字符类型的常量，都占用2个字节
        // Java中，字符采用utf-16编码
        char ch6 = ' ';
        System.out.println(ch6);
        // 字符类型：单引号引起来的单个字符
        // 注意：Java中，字符和字符串是两个不同的概念，字符串由字符组成
        /*
        转义字符：
        \将后面的普通字符转换为特殊含义
         */
        char ch7 = '\n';
        System.out.println("aaa"+ch7+"bbb");
        System.out.println("aaa\nbbb");
        System.out.println();
        System.out.println("aaa\rbbb");

        System.out.println("aaa\\n bbb");
        System.out.println("aaa\nbbb");
        System.out.println("\"Java\"");
        System.out.println("'Python'");
        System.out.println('P'+"ython");
    }
}

