package com.Abe.test05;


public class Demo {

    int id;
    static int sid;
    public void a(){
        System.out.println(id);
        System.out.println(sid);
        System.out.println("------a");
    }

    //1.static和public都是修饰符，并列的没有先后顺序，先写谁后写谁都行
    static public void b(){
        //System.out.println(this.id);      //4.在静态方法中不能使用this关键字
        //a();      //3.在静态方法中不能访问非静态的方法
        //System.out.println(id);       //2.在静态方法中不能访问非静态的属性
        System.out.println(sid);
        System.out.println("------b");
    }

    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //5.非静态的方法可以用对象名.方法名去调用
        Demo d = new Demo();
        d.a();
        //6.静态的方法可以用 [对象名].[方法名] 去调用，也可以用 [类名].[方法名] （推荐）
        Demo.b();
        d.b();

    }
}
