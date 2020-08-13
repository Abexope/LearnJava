/**
 * 异常的继承
 *
 *  - 如果父类抛出了多个异常，子类重写父类方法时，可以：
 *      1.抛出和父类相同的异常
 *      2.抛出父类异常的子类异常
 *      3.不抛出异常
 *
 *  - 父类方法没有抛出异常，子类重写父类方法时，
 *      不可以抛出异常，
 *      若子类内部产生异常，必须使用 try ... catch 处理，不能用 throw，throws
 */

public class Demo09InheritException {
}


class Fu {
    public void show01() throws NullPointerException, ClassCastException {}
    public void show02() throws IndexOutOfBoundsException {}
    public void show03() throws IndexOutOfBoundsException {}
    public void show04() {}
}


class Zi extends Fu {
    // 子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException, ClassCastException {}
    // 子类重写父类方法时，抛出父类异常的子类异常
    public void show02() throws ArrayIndexOutOfBoundsException {}
    // 子类重写父类方法时，不抛出异常
    public void show03() {}
    // 父类方法没有抛出异常，子类重写父类方法时，出现异常只能用 try...catch 处理
/*
    public void show04() throws Exception {}    // 不可以
*/
}
