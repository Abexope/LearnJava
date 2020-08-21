package com.Abe02.Reference;

/**
 *  对象的方法引用
 *      通过对象名引用成员方法
 */
public class Demo02MethodReference {
    public static void printString(Printable printable) {
        printable.print("Hello");
    }

    public static void main(String[] args) {
        MethodRerObject obj = new MethodRerObject();    // 非静态需要先实例化一个对象
        printString(obj::printUpperCaseString);
        printString(MethodRerObject::printLowerCaseString2);    // 静态直接用类本身即可
    }
}


class MethodRerObject {
    public void printUpperCaseString(String str) {
        System.out.println(str.toUpperCase());
    }
    public static void printLowerCaseString2(String str) {
        System.out.println(str.toLowerCase());
    }
}
