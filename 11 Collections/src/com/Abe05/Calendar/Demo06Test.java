package com.Abe05.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间日期相关总结
 */


public class Demo06Test {
    public static void main(String[] args) throws ParseException {
        // 空参构造方法
        Date d = new Date(3000L);
//        System.out.println(d.toLocaleString());     // 过时方法：获取当地时间格式的字符串
        System.out.println(d.getTime());    // Date对象：获取时间戳

        // 创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(d);      // Date -> String
        System.out.println(format);

        String str = "2088年08月08日 08:08:08";
        Date parse = sdf.parse(str);     // String -> Date
        System.out.println(parse);
    }
}


class Demo07Test {
    public static void main(String[] args) {
        // 获取日历对象
        Calendar c = Calendar.getInstance();

        // get方法
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH)+1;    // 西方月+1
        System.out.println(month);

        // set方法
        c.set(Calendar.YEAR, 2008);
        year = c.get(Calendar.YEAR);
        System.out.println(year);

        // add方法
        c.add(Calendar.YEAR, 88);
        year = c.get(Calendar.YEAR);
        System.out.println(year);
    }
}