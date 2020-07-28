package com.Abe.test01;


public class Girl {

    String name;
    double weight;
    Mom m = new Mom();

    public Girl() {
    }

    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Girl(String name, double weight, Mom m) {
        this.name = name;
        this.weight = weight;
        this.m = m;
    }

    public void love(Boy boy) {
        System.out.println("我男朋友的名字：" + boy.name + "我男友的年龄是：" + boy.age);
        boy.buy();
    }

    public void chatMom() {
        m.say();
    }
}

