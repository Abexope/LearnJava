/**
 * 变量的作用域
 * 局部变量：定义在方法中
 * 成员变量：定义在类中，方法外
 */

public class TestVar04 {
    int b = 20;     // 成员变量
    public static void main(String[] args){
        int a = 10;     // 局部变量
        System.out.println(a);  // OK
//        System.out.println(b);  // NO 因为该方法是静态方法，有static声明
    }
}
