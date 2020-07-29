package com.Abe.test07;

import com.Abe.test04.Person;
import com.Abe.test05.Demo;
import java.util.Date;

/**
 * 包，导入关键字 import
 */


public class Test01 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000L);//在导包以后，还想用其他包下同名的类，就必须要手动自己写所在的包。
        new Demo();
    }
}