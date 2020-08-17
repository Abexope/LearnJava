package com.Abe04.BuildInnerClsThread;

/**
 * 匿名内部类方式实现线程创建
 *
 * 匿名：没有名字
 * 内部类：写在其它类内部的类
 *
 * 匿名内部类的作用：简化代码
 *      将父类继承、重写方法、子类实例化一步完成
 *      将接口实现、重写方法、实现类实例化一步完成
 *
 * 匿名内部类的最终产物：子类/实现类对象，而这个类本身没有名字
 *
 * 格式：
 *      new 父类/接口() {
 *          重写父类/接口中的方法
 *      };
 */
public class Demo01UnnamedThread {
    public static void main(String[] args) {

        // Thread-0
        new Thread() {
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    System.out.println(this.getName() + "-->" + i);
                }
            }
        }.start();

        // Thread-1
        new Thread(
            new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 2000; i++) {
                        System.out.println(Thread.currentThread().getName() + "-->" + i);
                    }
                }
            }
        ).start();

        // main
        for (int i = 0; i < 2000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
