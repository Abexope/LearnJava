package InnerClass03;

/**
 * 基于接口实现匿名内部类
 */

public class DemoAnonInnerCls {
    public static void main(String[] args) {

        MyInterface obj1 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写接口方法");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类重写接口方法2");
            }
        };
        obj1.method();

        System.out.println("===========");

        MyInterface obj2 = new MyImplementCls();
        obj2.method();
        obj2.method2();

        System.out.println("===========");

        MyAbstractCls obj3 = new MyAbstractCls() {
            @Override
            void method() {
                System.out.println("匿名内部类重写抽象类方法");
            }

            @Override
            void method2() {
                System.out.println("匿名内部类重写抽象类方法2");
            }
        };
        obj3.method();

        System.out.println("===========");

        MyAbstractCls obj4 = new MyInheritCls();
        obj4.method();

        // 使用了匿名内类，省略引用变量，实例化的同时直接调用接口方法
        new MyInterface() {

            @Override
            public void method() {
                System.out.println("匿名内部类重写接口方法");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类重写接口方法2");
            }
        }.method2();

    }
}


class MyImplementCls implements MyInterface {
    // 有时没有必要为接口单独写一个实现类
    @Override
    public void method() {
        System.out.println("实现类重写接口方法");
    }  // 实现类

    @Override
    public void method2() {
        System.out.println("实现类重写了接口方法2");
    }
}


class MyInheritCls extends MyAbstractCls {
    // 有时没有必要为抽象类单独写一个继承类
    @Override
    void method() {
        System.out.println("继承类重写抽象类方法");
    }

    @Override
    void method2() {
        System.out.println("继承类重写抽象类方法2");
    }
}