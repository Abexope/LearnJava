package com.Abe.test01;

public class test {

    public static void main(String[] args) {
        // 创建一个Girl对象
        Girl g = new Girl();
        g.setAge(48);                       // 提供读写接口，保护属性的方式
        System.out.println(g.getAge());
    }

}
