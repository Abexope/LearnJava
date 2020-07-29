package com.Abe.test02;

/**
 * 接收模板类的执行对象
 *      执行对象执行模板方法
 */


public class Girl {

    public void play(Animal animal) {       // 父类引用指向子类对象
        // 形参是父类，实参是子类对象，根据子类的不同反映不同的效果
        animal.shout();
    }

}
