package com.Abe05.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar：日历类
 *  Calendar类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR）
 *  Calendar类无法直接创建对象使用，里面有一个而静态方法 getInstance(), 该方法返回了 Calendar 类的子对象
 *  static Calendar getInstance() 使用默认时区和语言环境获得一个日历
 *
 *  Calendar类的常用方法
 *      - public int get(int field)：返回给定日历字段的值
 *      - public void set(int field, int value)：将给定日历字段设置为给定值
 *      - public abstract void add(int field, int amount)：根据日历规则，为给定的日历字段添加或减去指定的时间量
 *      - public Date getTime()：返回一个表示此 Calendar 的时间值（从历元到现在的毫秒偏移量）的 Date 对象
 *
 *  成员方法的参数：
 *  int field：日历类的字段，可以使用 Calendar 类的静态成员变量获取
 *      - public static final int YEAR = 1;         // 年
 *      - public static final int MONTH = 2;        // 月
 *      - public static final int DATE = 5;         // 月中的某一天
 *      - public static final int DAY_OF_MONTH = 5; // 月中的某一天
 *      - public static final int HOUR = 10;        // 小时
 *      - public static final int MINUTE = 12;      // 分钟
 *      - public static final int SECOND = 13;      // 秒
 */


public class Demo05Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();    // 多态：父类对象指向子类引用
        System.out.println(c);      // 注意返回的月份值要 +1，西方的月份计数是 0~11

        /*
        java.util.GregorianCalendar[time=1597152682560,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
        zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,
        transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=7,
        WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=224,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,
        AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=31,SECOND=22,MILLISECOND=560,ZONE_OFFSET=28800000,DST_OFFSET=0]
        */
    }
}


class Demo06Calendar {
    public static void main(String[] args) {
        demo04();
    }

    private static void demo04() {
        /*
        public Date getTime()：返回一个表示此 Calendar 的时间值（从历元到现在的毫秒偏移量）的 Date 对象
            将日历对象转换为日期对象
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH)+1) + "-" + c.get(Calendar.DATE));
        Date date = c.getTime();
        System.out.println(sdf.format(date));
    }

    private static void demo03() {
        /*
        public abstract void add(int field, int amount)：根据日历规则，为给定的日历字段添加或减去指定的时间量
        把指定的字段增加/减少指定的值
        int field；传递指定的日历字段(YEAR, MONTH,...)
        int amount：增加/减少的值，支持负增长
         */
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 2);    // 把年份加2
        c.add(Calendar.MONTH, -3);  // 把月份减少3个月
        System.out.println(c.get(Calendar.YEAR) + " " + c.get(Calendar.MONTH));
    }

    private static void demo02() {
        /*
        public void set(int field, int value)：将给定的日历字段设置为定值
        参数：
            int field：传递给定的日历字段(YEAR, MONTH, ...)
            int value：传递的字段设置的具体值
         */
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 9999);     // 将 YEAR 设置为 9999
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DAY_OF_MONTH, 9);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH) + 1;  // 获取月份【西方0~11，东方1~12】
        System.out.println(month);

        int day = c.get(Calendar.DATE);
        System.out.println(day);

        int day2 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day2);

        // set的重载方法：同时设置年月日
        c.set(8888, 8, 8);

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

    }

    private static void demo01() {
        /*
        public int get(int field)：返回给定日历字段的值
            参数：传递指定的日历字段(YEAR, MONTH,...)
            返回值：日历字段代表的具体值
         */
        // 使用 getInstance() 方法获取 Calendar 对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);    // 获取年
        System.out.println(year);

        int month = c.get(Calendar.MONTH) + 1;  // 获取月份【西方0~11，东方1~12】
        System.out.println(month);

        int day = c.get(Calendar.DATE);
        System.out.println(day);

        int day2 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day2);
    }

}
