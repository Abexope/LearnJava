package com.Abe.test05;

/**
 * 局部内部类
 *      如果希望访问所在方法的局部变量，那么这个局部变量就必须是final的（或者只赋值一次）
 *      从Java8开始，只要局部变量事实不变那么final关键字可以省略
 *      为什么需要保证变量为final，因为与生命周期有关，只有不变才能谈到复制在类内部；
 *          1.new出来的对象在堆内存当中；
 *          2.局部变量是跟这方法走的，在栈内存当中
 *          3.方法运行结束之后立刻出栈，局部变量就会立刻消失
 *          4.但是new出来的对象会在堆当中持续存在，直到垃圾回收消失；
 */


public class OuterCls02 {
    String outerName = this.toString();

    public void outerA() {

        final int num = 10;     // 1. 在局部内部类访问到的变量必须是final修饰的，加final就是为了防止内部类修改局部变量

        class LocalInnerCls {

            String name = this.toString();          // [包名].[外部类名].$[内部类名]@[内地址的16位哈希值]

            public void inner() {
                System.out.println("method inner in InnerCls");
                System.out.println(outerName);      // 访问外部类成员变量
                System.out.println(this.name);      // 访问自身成员变量

                // num++;  /*在JDK1.8后，如果事实上没有在内部类中修改所在方法的局部变量，就OK*/

                /* 局部内部类方法向访问外部类的属性，内部代码块中不能有重名变量，否则触发“就近原则” */
                System.out.println(num);
                System.out.println(num);
            }

        }

        // 局部内部类实例化
        LocalInnerCls localInnerCls = new LocalInnerCls();
        localInnerCls.inner();

    }

    // 2.如果类B在整个项目只使用一次，那么就没有必要单独创建一个B类，使用内部类就可以了
    public Comparable outerB() {
        class B implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 1000;
            }
        }
        return new B();
    }

    public Comparable outerC() {
        // 3.匿名内部类实例化对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 20;
            }
        };
    }

    public void test() {
        Comparable com = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 220;
            }
        };

        System.out.println(com.compareTo("abc"));
    }
}


class test {
    public static void main(String[] args) {
        OuterCls02 outerCls02 = new OuterCls02();
        outerCls02.outerA();
    }
}
