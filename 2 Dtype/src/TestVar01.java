/**
 * 变量的声明与赋值
 */


public class TestVar01 {
    public static void main(String[] args) {
        // 变量声明
        // Java是强类型语言，声明变量就必须定义类型
        int a = 1;
        int b$ = 2;     // Java中，$也可以作为标识符的一部分
        double $c = 2.1;
        double d = a + b$ + $c;
        System.out.println(d);
        int age;    // 如果之定义变量却没有赋值，那么相当于没有定义此变量，后续代码使用此变量时会出错
        // 变量赋值
        age = 10;
        int age2 = 30;  // 可以在声明的同时赋值
        System.out.println(age);
        System.out.println(age2 + 100);

    }
}


class TestVar02{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}


class TestVar03{
    public static void main(String[] args){
//        int num1 = 10;
//        int num2 = 20;
        int num1 = 10, num2 = 20;
        num1 = num2;
        num2 = num2 + 10;
        num1 = num2 - 10;
        num2 = num1;
        System.out.println("num1="+num1);       // 输出什么? 20
        System.out.println("num2="+num2);       // 输出什么? 20
    }
}