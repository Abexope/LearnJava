package InnerClass02;

/**
 * 局部内部类
 */


public class Outer {

    public void methodOuter() {

        class Inner {   // 局部内部类
            final int num = 10;     // 若局部变量事实上未更新，final可省略
            // num = 20;   // 不可以！！！
            public void methodInner() {
                System.out.println(num);    // 10
            }
        }
        new Inner().methodInner();              // OK
        System.out.println(new Inner().num);    // OK
    }

}
