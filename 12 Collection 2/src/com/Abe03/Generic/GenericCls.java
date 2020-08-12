package com.Abe03.Generic;

/**
    含有泛型的类
    泛型表示数据类型未知，可以接收任意数据类型，例如：Integer、String、Student...
    具体的数据类型在实例化对象时才确定
 */
public class GenericCls<$$rrr> {   // “< >”中可以使用任何合法标识符表示泛型，习惯上使用 E 或 T

    private $$rrr name;

    public $$rrr getName() {
        return name;
    }

    public void setName($$rrr name) {
        this.name = name;
    }

}


class TestGenericCls {
    public static void main(String[] args) {
        GenericCls<String> gc = new GenericCls<>();     // 指定具体类型是字符串
        gc.setName("可以传字符串");
        System.out.println(gc.getName());

        GenericCls<Integer> gc2 = new GenericCls<>();   // 指定具体类型是整型
        gc2.setName(12345);
        System.out.println(gc2.getName());
    }
}
