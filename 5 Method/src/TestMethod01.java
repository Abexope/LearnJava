/**
 * 方法的定义和使用
 */


public class TestMethod01{

    //方法的定义：（写方法）
    public static int add(int num1,int num2){
        int sum = 0;
        sum += num1;
        sum += num2;
        return sum;     //将返回值返回到方法的调用处
    }

    public static void main(String[] args){
        //方法的调用：（用方法）
        //10+20:
        int num = add(10,20);
        System.out.println(num);
        //30+90:
        int sum = add(30,90);
        System.out.println(sum);
        //50+48:
        System.out.println(add(50,48));

    }
}


class TestMethod02{

    public static void add(int num1,int num2){
        int sum = 0;
        sum += num1;
        sum += num2;
        System.out.println(sum);
        //return;
    }

    public static void main(String[] args){
        //10+20:
        //方法的调用：（用方法）
        add(10,20);
        //30+90:
        add(30,90);
        //50+48:
        //System.out.println(add(50,48));//报错：TestMethod03.java:22: 错误: 此处不允许使用 '空' 类型

    }
}

