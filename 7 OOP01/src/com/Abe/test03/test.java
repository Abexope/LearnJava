package com.Abe.test03;

/**
 * 对象实例化过程中的内存分析
 */


public class test {

    public void change1(int i){
        i=3366;
    }

    public void change2(Person p){
        p=new Person(3,22,"西城");
    }

    public void change3(Person p){
        p.setAge(66);
    }

    public static void main(String[] args) {
        test t = new test();
        int age=40;
        Person tom=new Person(1,20,"海淀");
        Person jack=new Person(2,30,"朝阳");
        t.change1(age);
        t.change2(tom);
        t.change3(jack);
        System.out.println(age); //40
        System.out.println("id:"+jack.id+",age:"+jack.age+",school:"+jack.school); //id:2,age:66,school:"朝阳"
    }

}
