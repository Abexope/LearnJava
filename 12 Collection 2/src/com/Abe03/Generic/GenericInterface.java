package com.Abe03.Generic;

/**
    含有泛型的接口
 */

public interface GenericInterface <I> {
    public abstract void method(I i);
}


/**
    使用方式1：定义实现类，在实现接口时指定接口类型
    例如：
        public interface Iterator<E> {
            E next();
        }
        Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写的next方法泛型默认为String
        public final class Scanner implements Iterator<String> {
            public Sting next() {...}
        }
 */
class GenericInterfaceImpl1 implements GenericInterface<String> {   // 接口实现类
    // 实现类中指定了接口的泛型，那么重写的抽象方法中就统一使用指定的泛型

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}


class TestGenericInterfaceImpl1 {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("啦啦啦");
    }
}


/**
    使用方式2：实现类使用接口指定的泛型
        定义一个含有泛型的类，创建对象的时候确定泛型的类型
    例如：
        public interface List<E> {
            boolean add(E e);
            E get(int index);
        }
        public class ArrayList<E> implements List<E> {
            public boolean add(E e) {}
            public E get(int index) {}
        }

 */
class GenericInterfaceImpl2<T> implements GenericInterface<T> {     // 泛型的标识符可以与接口的不一样，只要实现类内部保持统一即可
    // 实现类中未指定接口的泛型，此时该实现类就是一个泛型类

    @Override
    public void method(T e) {
        System.out.println(e);
    }
}


class TestGenericInterfaceImpl2 {
    public static void main(String[] args) {
        GenericInterface<String> gi2 = new GenericInterfaceImpl2<>();           // 多态写法
        gi2.method("迪丽热巴");

        GenericInterfaceImpl2<Integer> gi3 = new GenericInterfaceImpl2<>();     // 非多态写法
        gi3.method(1235);
    }
}
