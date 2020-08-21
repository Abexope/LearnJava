package com.Abe01.FunctionalInterface;

/**
 *  函数式接口
 *      有且只有一个抽象方法的接口
 *      接口中仍然可以包含其他类型的方法（默认、静态、私有）
 *
 *  @FunctionalInterface注解
 *  作用：检测接口是否是一个函数式接口
 *      是：编译成功
 *      否：编译失败（接口中没有抽象方法/抽象方法的数量 >1
 */

@java.lang.FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void method();
}
