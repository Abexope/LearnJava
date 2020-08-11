package com.Abe04.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Date练习：计算一个人出生了多少天
 *
 * 分析：
 *      1.使用 Scanner 类接收初始日期
 *      2.使用 DataFormat 类中的方法parse，将出生日期解析为 Date 对象
 *      3.将 Date 对象转化为毫秒值
 *      4.将当前日期转化为毫秒值
 *      5.使用当前的毫秒值 - 出生日期的毫秒值
 *      6.把毫秒值转换为天(s/1000/60/60/24)
 */


public class Demo04Test {
    public static void main(String[] args) throws ParseException {
        // 1.使用 Scanner 类接收初始日期
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的出生日期，格式为：“yyyy-MM-dd”");
        String birthdayDateString = sc.next();

        // 2.使用 DataFormat 类中的方法parse，将出生日期解析为 Date 对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);

        // 3.将 Date 对象转化为毫秒值
        long birthdayDateTime = birthdayDate.getTime();

        // 4.将当前日期转化为毫秒值
        long todayTime = new Date().getTime();

        // 5.使用当前的毫秒值 - 出生日期的毫秒值
        long time = todayTime - birthdayDateTime;

        // 6.把毫秒值转换为天(s/1000/60/60/24)
        System.out.println(time / 1000 / 60 / 60 / 24);
    }
}
