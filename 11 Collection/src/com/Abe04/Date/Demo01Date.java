package com.Abe04.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date类
 * 东八区时间原点：1970年01月01日 08:00:00:000(毫秒)
 */

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());     // 获取时间原点到当前系统时刻之间一共经历了多少毫秒
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }
}


class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }

    private static void demo03() {
        /*
        Date类的成员方法
        long getTime() 把日期转换为毫秒，相当于 System.currentTimeMillis()
            返回此Date对象所在系统时间自东八区时间原点以来的毫秒数
         */
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);   // 1597148882943
    }

    private static void demo02() {
        /*
        Date类的带参构造方法：Date(long date)
         */
        Date d0 = new Date(0L);   // 实例化一个东八区时间原点对象，0毫秒，0L：long型常量
        System.out.println(d0);   // Thu Jan 01 08:00:00 CST 1970

        Date d2 = new Date(1811111111811L);     // 输入毫秒值
        System.out.println(d2);

    }

    private static void demo01() {
        /*
        Date的空参构造方法：Date()
         */
        Date date = new Date();
        System.out.println(date);   // 获取当前系统时间 Tue Aug 11 20:20:46 CST 2020
    }
}


class Demo03DateFormat {

    public static void main(String[] args) throws ParseException {
        demo02();
    }

    private static void demo02() throws ParseException {
        /*
        使用DateFormat类方法的parse，把文本解析为日期
        Date parse(String source) 把符合模式的字符串解析为Date日期
        使用步骤：
            1.创建SimpleDateFormat对象，构造方法中传递指定模式
            2.调用SDF对象中的方法parse，把符合构造方法中的模式的字符串，解析为Date日期
         */
        // 1.创建SimpleDateFormat对象，构造方法中传递指定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 2.调用SDF对象中的方法parse，把符合构造方法中的模式的字符串，解析为Date日期
        Date date = sdf.parse("2020年08月11日 20时54分40秒");
        /*
        public Date parse(String source) throws ParseException
        parse方法声明了一个异常叫 ParseException 解析异常
        如果字符串和构造方法中的模式不一样，那么程序就会抛出异常
        调用一个抛出了异常的方法，就必须处理这个异常：
            1.throws继续声明抛出这个异常
            2.try...catch自己处理异常
         */
        System.out.println(date);
    }

    private static void demo01() {
        /*
        DataFormat类中的方法format，将日期格式化为文本
        使用步骤：
            1.创建SimpleDateFormat对象，构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，将Date日期格式化为如何模式的字符串
         */
        // 1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        // 2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，将Date日期格式化为如何模式的字符串
        String text = sdf.format(date);
        
        System.out.println(date);
        System.out.println(text);
    }

}

