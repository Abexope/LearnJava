package com.Abe.test04;

/**
 * this 指针
 */


public class Person {
    //属性
    int age;
    String name;
    double height;
    //空构造器
    public Person(){
    }
    //有参构造器
    public Person(String name, int age, double height){
        this(age,name);
        this.height = height;
    }
    public Person(int age,String name){
        this(age);
        this.name = name;
    }
    public Person(int age){
        this.age = age;
    }
    //方法：
    /*public void eat(){
        int age = 10;
        System.out.println(age);//就近原则，age指的是离它近的age--》局部变量的age
        System.out.println(this.age);//这里指代的就是属性的age
        System.out.println("我喜欢吃饭");
    }*/
    public void play(){
        /*this.*/eat();
        System.out.println("上网");
        System.out.println("洗澡");
    }
    public void eat(){
        System.out.println(/*this.*/age);
        System.out.println("吃饭");
    }
}
