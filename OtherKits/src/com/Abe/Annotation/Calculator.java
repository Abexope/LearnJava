package com.Abe.Annotation;

public class Calculator {

    @Check
    public void add() {
        // 加法
        System.out.println("1 + 0 = " + (1 + 0));
    }

    @Check
    public void sub() {
        // 减法
        System.out.println("1 - 0 = " + (1 - 0));
    }

    @Check
    public void mul() {
        // 乘法
        System.out.println("1 * 0 = " + (1 * 0));
    }

    @Check
    public void div() {
        // 除法
        System.out.println("1 / 0 = " + (1 / 0));
    }

    public void show() {
        System.out.println("永无bug...");
    }

}
