package com.Abe.LambdaExpression;

/**
 * 练习：给定一个计算器`com.Abe.LambdaExpression.Calculator`接口，内含抽象方法`calc`可以将两个int数字相加得到和值
 */

public class Demo04Lambda {
    public static void main(String[] args) {
        // TODO: 请在此使用Lambda表达式【标准格式】调用invokeCalc方法计算120+130的结果
        invokeCalc(120, 130, (a, b) -> a + b);
    }
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}


interface Calculator {
    int calc(int a, int b);
}
